package com.sda.onlinestore.entities;

import javax.persistence.*;

@Entity
@Table(name = "producer")

public class ProducerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long producerId;
    @Column(length = 50)
    private String producerName;

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    @Column(length = 255)


    @Override
    public String toString() {
        return "ProducerEntity{" +
                "producerId=" + producerId +
                ", producerName='" + producerName + '\'' +
                '}';
    }
}
