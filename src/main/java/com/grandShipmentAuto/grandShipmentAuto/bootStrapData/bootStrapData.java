package com.grandShipmentAuto.grandShipmentAuto.bootStrapData;

import com.grandShipmentAuto.grandShipmentAuto.repository.ContainerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootStrapData implements CommandLineRunner {

    private final ContainerRepository containerRepository;
    private final Logger logger = LoggerFactory.getLogger(bootStrapData.class);

    public bootStrapData(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }


    @Override
    public void run(String... args) {

    }
}
