package serie11.esercizio02;

import javax.persistence.*;
@Entity
public class Contact {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private long phone_number;
    @Column
    private long mobile_phone_number;
    @Column
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public long getMobile_phone_number() {
        return mobile_phone_number;
    }

    public void setMobile_phone_number(long mobile_phone_number) {
        this.mobile_phone_number = mobile_phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
