package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

@Service
public class OrderState {
    private Integer state;

    public OrderState(){

    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OrderState{" +
                "state=" + state +
                '}';
    }
}
