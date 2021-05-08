package com.sda.onlinestore.services;


import com.sda.onlinestore.entities.ProducerEntity;
import com.sda.onlinestore.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    public void addProducer(ProducerEntity newProducer) {
        producerRepository.save(newProducer);
    }
    public void testProducer(ProducerEntity newProducer) {
        System.out.println("testProducer");
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


    public ProducerEntity getProducer(long id) {
        Optional<ProducerEntity> producerEntityOptional = producerRepository.findById(id);
        ProducerEntity producerEntity = producerEntityOptional.get();
        return producerEntity;
    }
     public List<ProducerEntity> getAll(){
        List<ProducerEntity> producerEntities = producerRepository.findAll();
        return producerEntities;
     }

}