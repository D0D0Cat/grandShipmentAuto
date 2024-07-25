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

    }
}
