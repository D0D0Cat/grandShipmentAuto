package com.grandShipmentAuto.grandShipmentAuto.controllers;

import com.grandShipmentAuto.grandShipmentAuto.models.Container;
import com.grandShipmentAuto.grandShipmentAuto.services.containerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/containers")
public class containerController {

    @Autowired
    private containerService containerService;

    @GetMapping
    public Iterable<Container> getAllContainers(){
        return containerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Container> getContainerById(@PathVariable Long id){
        Optional<Container> container = containerService.findById(id);
        if(container.isPresent()){
            return ResponseEntity.ok(container.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Container createContainer(@RequestBody Container container){
        System.out.println("Container Created Successfully");
        return containerService.save(container);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Container> updateContainer(@PathVariable Long id, @RequestBody Container containerDetails){
        Optional<Container> container = containerService.findById(id);
        if(container.isPresent()){
            Container updatedContainer = container.get();
            updatedContainer.setContains(containerDetails.getContains());
            updatedContainer.setWeight(containerDetails.getWeight());
            return ResponseEntity.ok(containerService.save(updatedContainer));
        } else {
            System.out.println("Container Updated Successfully");
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContainer(@PathVariable Long id){
        containerService.deleteById(id);
        System.out.println("Container Deleted Successfully");
        return ResponseEntity.noContent().build();
    }
}
