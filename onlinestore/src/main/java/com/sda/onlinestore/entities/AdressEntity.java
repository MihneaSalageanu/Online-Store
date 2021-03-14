package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AdressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer addressId;
    private String country;
    private String city;
    private String street;
    private long zipCode;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(long zipCode){
        this.zipCode = zipCode;
    }
}
