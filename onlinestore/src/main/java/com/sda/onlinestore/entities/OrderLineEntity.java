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

    @ManyToOne
    private ProductsEntity product;

    public Integer getOrderLineId() {
        return OrderLineId;
    }

    public void setOrderLineId(Integer orderLineId) {
        OrderLineId = orderLineId;
    }

    public Double getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(Double quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    public Double getPrice() {
        return price;
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

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {

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
>>>>>>> ca145a09790a54afd0437def1786d88f33351612
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
