package com.sda.services;

import com.sda.onlinestore.entity.ProducerEntity;
import com.sda.onlinestore.entity.ProductsEntity;
import com.sda.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    public void addProducer(ProducerEntity newProducer) {
        producerRepository.save(newProducer);
    }

    public List<ProducerEntity> getAllProducers() {
        return producerRepository.findAll();
    }

    public void editProducer(ProducerEntity editedProducer) {
        producerRepository.save(editedProducer);
    }

    public void deleteProducer(long id) {
        producerRepository.deleteById(id);
    }

    public ProducerRepository getProducerRepository() {
        return producerRepository;
    }

    public void setProducerRepository(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }
}
