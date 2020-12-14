package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

@Service
public class UserGet {

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String neighbour;
    private String street;
    private String number;
    private String reference;

    public UserGet(){
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getNeighbour() { return neighbour; }
    public void setNeighbour(String neighbour) { this.neighbour = neighbour; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    @Override
    public String toString() {
        return "UserGet{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", neighbour='" + neighbour + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
