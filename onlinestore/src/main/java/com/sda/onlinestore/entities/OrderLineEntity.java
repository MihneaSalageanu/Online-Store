package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "OrderLine")
public class OrderLineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderLineId;

    @ManyToOne
    private ProductsEntity product;
    private Double quantityOfProducts;
    private Double price;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;



    public Double getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public Double getPrice() {
        return price;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
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
