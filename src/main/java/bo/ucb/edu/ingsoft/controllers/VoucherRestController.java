package bo.ucb.edu.ingsoft.controllers;

import bo.ucb.edu.ingsoft.models.entity.Voucher;
import bo.ucb.edu.ingsoft.models.services.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VoucherRestController {

    @Autowired
    private IVoucherService voucherService;

    @GetMapping("/voucher")
    public List<Voucher> index(){
        return  voucherService.findAll();
    }

    @GetMapping("/voucher/page/{page}")
    public Page<Voucher> index(@PathVariable Integer page){
        Pageable pageable = PageRequest.of(page,4);
        return  voucherService.findAll(pageable);
    }

    @GetMapping("/voucher/{voucherId}")
    public ResponseEntity<?> show(@PathVariable Integer voucherId) {

        Voucher voucher = null;
        Map<String, Object>  response = new HashMap<>();

        try {
            voucher = voucherService.findById(voucherId);
        } catch (DataAccessException e){
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        if(voucher == null){
            response.put("mensaje", "El Comprobante con ID: ".concat(voucherId.toString().concat(" no existe en la base de datos")));
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Voucher>(voucher, HttpStatus.OK);
    }

    @PostMapping("/voucher")
    public ResponseEntity<?> create(@Valid @RequestBody Voucher voucher, BindingResult result) {

        Voucher voucherNew = null;
        Map<String, Object>  response = new HashMap<>();

        if(result.hasErrors()){

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField()+ "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.BAD_REQUEST);
        }

        try{
            voucherNew = voucherService.save(voucher);
        } catch (DataAccessException e){
            response.put("mensaje", "Error al insertar los datos en la base de datos");
            response.put("error", "No se completaron los espacios requeridos o introdujo datos erroneos");
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El comprobante ha sido creado con exito");
        response.put("voucher", voucherNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/voucher/{voucherId}")

    public ResponseEntity<?> update( @Valid @RequestBody Voucher voucher, BindingResult result, @PathVariable Integer voucherId){
        Voucher voucherActual = voucherService.findById(voucherId);
        Voucher voucherUpdated = null;

        Map<String, Object>  response = new HashMap<>();

        if(result.hasErrors()){

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField()+ "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.BAD_REQUEST);
        }

        if(voucherActual == null){
            response.put("mensaje", "No se pudo editar el comprobante El Comprobante con ID: ".concat(voucherId.toString().concat(" no existe en la base de datos")));
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.NOT_FOUND);
        }

        try {
            voucherActual.setDate(voucher.getDate());
            voucherActual.setTotal(voucher.getTotal());

            voucherUpdated = voucherService.save(voucherActual);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al actualizar el comprobante en la base de datos");
            response.put("error", "Los espacios requeridos no pueden estar vacios o introdujo datos erroneos");
            return  new ResponseEntity<Map<String, Object> >(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El comprobante ha sido actualizado con exito");
        response.put("voucher", voucherUpdated);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/voucher/{voucherId}")
    public ResponseEntity<?> delete(@PathVariable Integer voucherId) {

        Map<String, Object>  response = new HashMap<>();
        try {
            voucherService.delete(voucherId);
        } catch (DataAccessException e){
            response.put("mensaje", "Error al eliminar el comprobante en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El comprobante ha sido eliminado con exito");

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}
