package com.grandShipmentAuto.grandShipmentAuto.bootStrapData;

import com.grandShipmentAuto.grandShipmentAuto.repository.containerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootStrapData implements CommandLineRunner {

    private final containerRepository containerRepository;
    private final Logger logger = LoggerFactory.getLogger(bootStrapData.class);

    public bootStrapData(containerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("Labas");
        // Uncomment the following lines if you want to use these methods
        // System.out.println(containerRepository.findById(1L));
        // System.out.println(containerRepository.findAll());
    }
}
