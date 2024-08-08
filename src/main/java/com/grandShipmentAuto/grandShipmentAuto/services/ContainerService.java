package com.grandShipmentAuto.grandShipmentAuto.services;

import com.grandShipmentAuto.grandShipmentAuto.models.Container;
import com.grandShipmentAuto.grandShipmentAuto.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class ContainerService {

    @Autowired
    private ContainerRepository ContainerRepository;

    @Autowired
    private FileStorageService FileStorageService;

    public Iterable<Container> findAll() {
        return ContainerRepository.findAll();
    }

    public Optional<Container> findById(Long id) {
        return ContainerRepository.findById(id);
    }

    public Container save(Container container) {
        return ContainerRepository.save(container);
    }

    public void deleteById(Long id) {
        ContainerRepository.deleteById(id);
    }
}
