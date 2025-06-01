package com.ia.PROYECTO.IA.services;

import com.ia.PROYECTO.IA.models.Sensor;
import com.ia.PROYECTO.IA.repositories.sensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class sensorServices {
    @Autowired
    private sensorRepository sensorRepository;
    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }
    public Optional<Sensor> getSensorById(int id) {
        return sensorRepository.findById(id);
    }
    public Sensor saveSensor(Sensor sensor) {
        if(sensor.getCreatedAt() == null) {
            sensor.setCreatedAt(LocalDateTime.now());
        }
        return sensorRepository.save(sensor);
    }
    public void deleteSensorById(int id) {
        sensorRepository.deleteById(id);
    }
    public boolean updateSensor(int Id,Sensor sensor) {
        Optional<Sensor> sensorU=sensorRepository.findById(Id);
        if(sensorU.isPresent()) {
            Sensor existing=sensorU.get();
            existing.setIdZona(sensor.getIdZona());
            existing.setBateria(sensor.getBateria());
            existing.setStatus(sensor.getStatus());
            existing.setUltimaActualizacion(sensor.getUltimaActualizacion());
            existing.setName(sensor.getName());
            existing.setSensorType(sensor.getSensorType());
            existing.setCreatedAt(sensor.getCreatedAt());
            existing.setEstado(sensor.getEstado());
            sensorRepository.save(existing);
            return true;
        }
        return false;
    }
}
