package com.sda.onlinestore.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "comanda")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private double totalCost;
    private Date date;
    private String status;

    @OneToMany
    private List<OrderLineEntity> orderline = new ArrayList<>();

    @OneToOne
    private AddressEntity deliveryAddress;

    @OneToOne
    private UserAccountEntity userAccount;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderLineEntity> getOrderline() {
        return orderline;
    }

    public void setOrderline(List<OrderLineEntity> orderline) {
        this.orderline = orderline;
    }

    public AddressEntity getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(AddressEntity deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public UserAccountEntity getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountEntity userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", username='" +
                ", totalCost=" + totalCost +
                ", date=" + date +
                '}';
    }



}
