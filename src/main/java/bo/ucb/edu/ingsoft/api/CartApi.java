package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CartDetailBl;
import bo.ucb.edu.ingsoft.bl.ProductBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.CartDetailAdd;
import bo.ucb.edu.ingsoft.dto.ProductAdd;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.model.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/cart")
public class CartApi {
    private TransactionBl transactionBl;
    private CartDetailBl cartDetailBl;


    @Autowired
    public CartApi(TransactionBl transactionBl,CartDetailBl cartDetailBl){
        this.transactionBl = transactionBl;
        this.cartDetailBl = cartDetailBl;
    }

    @RequestMapping( method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    //@CrossOrigin(origins = "http://localhost:4200")
    public CartDetailAdd createCartDetail(@RequestBody CartDetailAdd cartDetailAdd, CartDetail cartDetail, Product product, Cart cart, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);

        transactionBl.createTransaction(transaction);
        CartDetailAdd cartResponse = cartDetailBl.createCartDetail(cartDetailAdd,cartDetail,product,cart, transaction);
        return cartResponse;
    }


}
