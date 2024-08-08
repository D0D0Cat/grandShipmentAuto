package com.grandShipmentAuto.grandShipmentAuto.controllers;

import com.grandShipmentAuto.grandShipmentAuto.models.Container;
import com.grandShipmentAuto.grandShipmentAuto.services.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/containers")
public class ContainerController {

    @Autowired
    private ContainerService ContainerService;

    @GetMapping
    public Iterable<Container> getAllContainers(){
        return ContainerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Container> getContainerById(@PathVariable Long id){
        Optional<Container> container = ContainerService.findById(id);
        if(container.isPresent()){
            return ResponseEntity.ok(container.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Container> createContainer(@RequestBody Container container) {
        Container savedContainer = ContainerService.save(container);
        return new ResponseEntity<>(savedContainer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Container> updateContainer(@PathVariable Long id, @RequestBody Container containerDetails){
        Optional<Container> container = ContainerService.findById(id);
        if(container.isPresent()){
            Container updatedContainer = container.get();
            updatedContainer.setContains(containerDetails.getContains());
            updatedContainer.setWeight(containerDetails.getWeight());
            // Update hazardType if needed
            if (containerDetails.getHazardType() != null) {
                updatedContainer.setHazardType(containerDetails.getHazardType());
            }
            return ResponseEntity.ok(ContainerService.save(updatedContainer));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContainer(@PathVariable Long id){
        ContainerService.deleteById(id);
        System.out.println("Container Deleted Successfully");
        return ResponseEntity.noContent().build();
    }
}