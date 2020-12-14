package bo.ucb.edu.ingsoft.controllers;

import bo.ucb.edu.ingsoft.models.entity.Voucher;
import bo.ucb.edu.ingsoft.models.services.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
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

    @GetMapping("/voucher/{voucherId}")
    public  Voucher show(@PathVariable Integer voucherId) {
        return voucherService.findById(voucherId);
    }

    @PostMapping("/voucher")
    @ResponseStatus(HttpStatus.CREATED)
    public Voucher create(@RequestBody Voucher voucher) {
        return voucherService.save(voucher);
    }

    @PutMapping("/voucher/{voucherId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Voucher update(@RequestBody Voucher voucher, @PathVariable Integer voucherId){
        Voucher voucherActual = voucherService.findById(voucherId);

        voucherActual.setDate(voucher.getDate());
        voucherActual.setTotal(voucher.getTotal());

        return  voucherService.save(voucherActual);
    }

    @DeleteMapping("/voucher/{voucherId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer voucherId) {
        voucherService.delete(voucherId);
    }

}
