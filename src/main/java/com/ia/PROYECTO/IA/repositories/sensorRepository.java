package com.ia.PROYECTO.IA.repositories;

import com.ia.PROYECTO.IA.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface sensorRepository extends JpaRepository<Sensor, Integer> {

}
