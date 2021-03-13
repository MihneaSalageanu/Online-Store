package com.sda.onlinestore.entity;

import javax.persistence.*;

@Entity
@Table (name = "producer")

public class ProducerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long producerId;
    @Column(length = 50)
    private String producerName;
    @Column(length = 255)

    public long getProducerId() {
        return producerId;
    }

    public void setProducerId(long producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
}
