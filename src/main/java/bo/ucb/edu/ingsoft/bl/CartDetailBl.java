package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.CartDetailDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.CartDetailAdd;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.model.Cart;
import bo.ucb.edu.ingsoft.model.CartDetail;
import bo.ucb.edu.ingsoft.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDetailBl {
    private CartDetailDao cartDetailDao;
    private TransactionDao transactionDao;


    @Autowired
    public CartDetailBl(CartDetailDao cartDetailDao, TransactionDao transactionDao){
        this.cartDetailDao = cartDetailDao;
        this.transactionDao = transactionDao;
    }

    public CartDetailAdd createCartDetail(CartDetailAdd cartDetailAdd, CartDetail cartDetail, Product product,Cart cart, Transaction transaction){

       cartDetail.setCartId(cartDetailAdd.getCartId());
       cartDetail.setProductId(cartDetailAdd.getProductId());
       cartDetail.setQtty(cartDetailAdd.getQtty());
       cartDetail.setTxId(transaction.getTxId());
       cartDetail.setTxHost(transaction.getTxHost());
       cartDetail.setTxUserId(transaction.getTxUserId());
       cartDetail.setTxDate(transaction.getTxDate());

       cartDetailDao.createCartDetail(cartDetail);

        return cartDetailAdd;
    }
}
