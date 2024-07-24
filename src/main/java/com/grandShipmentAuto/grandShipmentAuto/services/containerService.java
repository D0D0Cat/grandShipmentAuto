package com.grandShipmentAuto.grandShipmentAuto.services;

import com.grandShipmentAuto.grandShipmentAuto.models.Container;
import com.grandShipmentAuto.grandShipmentAuto.models.HazardType;
import com.grandShipmentAuto.grandShipmentAuto.repository.containerRepository;
import com.grandShipmentAuto.grandShipmentAuto.repository.HazardTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class containerService {

    @Autowired
    private containerRepository containerRepository;

    @Autowired
    private HazardTypeRepository hazardTypeRepository;

    public Iterable<Container> findAll(){
        return containerRepository.findAll();
    }

    public Optional<Container> findById(Long id){
        return containerRepository.findById(id);
    }

    public Container save(Container container){
        return containerRepository.save(container);
    }

    public void deleteById(Long id) {
        containerRepository.deleteById(id);
    }

    public Optional<HazardType> findHazardTypeByName(String type) {
        return hazardTypeRepository.findByType(type);
    }
}
