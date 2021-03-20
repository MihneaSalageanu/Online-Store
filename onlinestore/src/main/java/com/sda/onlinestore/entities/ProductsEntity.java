package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "produse")

public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String description;
    private String url;

    @ManyToOne
    private CategoryEntity category;
    private long price;

    @ManyToOne
    private ProducerEntity producer;

   enum ProductType{
       ELECTRONICE, ALIMENTE, HAINE
   }
   @Enumerated(EnumType.STRING)
   private ProductType type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public ProducerEntity getProducer() {
        return producer;
    }

    public void setProducer(ProducerEntity producer) {
        this.producer = producer;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", producer=" + producer +
                ", type=" + type +
                '}';
    }
}