package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

@Service
public class VoucherDelete {
    private Integer txStatus;

    public VoucherDelete(){

    }

    public Integer getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(Integer txStatus) {
        this.txStatus = txStatus;
    }

    @Override
    public String toString() {
        return "VoucherDelete{" +
                "txStatus=" + txStatus +
                '}';
    }
}
