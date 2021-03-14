package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "OrderLine")
public class OrderLineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer OrderLineId;

    //produs Many to one
    private String product;
    private Double quantityOfProducts;
    private Double price;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Integer getId() {
        return OrderLineId;
    }

    public void setId(Integer id) {
        OrderLineId = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(double quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLineEntity{" +
                "Id=" + OrderLineId +
                ", product='" + product + '\'' +
                ", quantityOfProducts=" + quantityOfProducts +
                ", price=" + price +
                '}';
    }
}
