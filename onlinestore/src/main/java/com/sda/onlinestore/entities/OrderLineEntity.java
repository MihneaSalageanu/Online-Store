package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "OrderLine")
public class OrderLineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderLineId;
    private Double quantityOfProducts;
    private Double price;

    @ManyToOne
    private ProductsEntity product;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;



    public Integer getId() {
        return OrderLineId;
    }

    public void setId(Integer id) {
        OrderLineId = id;
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

    public ProductsEntity getProduct(){
        return product;
    }

    public void setProduct(ProductsEntity product){
        this.product = product;
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

    public Integer getOrderLineId() {
        return OrderLineId;
    }

    public void setOrderLineId(Integer orderLineId) {
        OrderLineId = orderLineId;
    }

    public void setQuantityOfProducts(Double quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public enum OrderStatus {
        PENDING, AWAITING_PAYMENT, AWAITING_SHIPPING, SHIPPED, COMPLETED
    }
}
