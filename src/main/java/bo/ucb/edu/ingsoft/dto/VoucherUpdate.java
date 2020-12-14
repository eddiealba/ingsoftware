package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class VoucherUpdate {

    private Date date;
    private BigDecimal total;

    public VoucherUpdate(){

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "VoucherUpdate{" +
                "date=" + date +
                ", total=" + total +
                '}';
    }
}
