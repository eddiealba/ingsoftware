package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

@Service
public class ProductDelete {
    private Integer txStatus;

    public  ProductDelete(){

    }

    public Integer getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(Integer txStatus) {
        this.txStatus = txStatus;
    }

    @Override
    public String toString() {
        return "ProductDelete{" +
                "txStatus=" + txStatus +
                '}';
    }
}
