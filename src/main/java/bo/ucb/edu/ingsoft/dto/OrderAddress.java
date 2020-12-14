package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

@Service
public class OrderAddress {
    private Integer addressId;
    private Integer neighbourId;
    private String street;
    private String number;
    private String reference;
    public OrderAddress(){

    }

    public Integer getNeighbourId() { return neighbourId; }

    public void setNeighbourId(Integer neighbourId) { this.neighbourId = neighbourId; }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "OrderAddress{" +
                "addressId=" + addressId +
                ", neighbourId=" + neighbourId +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
