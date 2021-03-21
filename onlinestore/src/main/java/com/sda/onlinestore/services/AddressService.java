package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.AddressEntity;
import com.sda.onlinestore.repositories.AddressRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void editAddress(AddressEntity editedAddress){
        addressRepository.save(editedAddress);
    }

    public void addAddress(AddressEntity newAddress) {
        addressRepository.save(newAddress);
    }

    public void deleteAddressById(Integer id) {
        addressRepository.deleteById(id);
    }

    public List<AddressEntity> addressAllList() {
        return addressRepository.findAll();
    }

    public AddressEntity getAddress(Integer id) {
        Optional<AddressEntity> addressEntityOptional = addressRepository.findById(id);
        AddressEntity addressEntity = addressEntityOptional.get();
        return addressEntity;
    }


}
