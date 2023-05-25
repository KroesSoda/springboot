package com.soda.app.Model.Embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class GeneralInfo {
    @Column(length = 20,nullable = false)
    private String firstname;
    @Column(length = 20,nullable = false)
    private String lastname;
    @Column(length = 20,nullable = false)
    private String phone;
    @Column(length = 20,nullable = false)
    private String address;



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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
