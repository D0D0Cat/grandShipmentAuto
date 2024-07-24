package com.grandShipmentAuto.grandShipmentAuto.repository;

import com.grandShipmentAuto.grandShipmentAuto.models.HazardType;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface HazardTypeRepository extends CrudRepository<HazardType, Long> {
    Optional<HazardType> findByType(String type);
}
