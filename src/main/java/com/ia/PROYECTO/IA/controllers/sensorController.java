package com.ia.PROYECTO.IA.controllers;


import com.ia.PROYECTO.IA.models.Sensor;
import com.ia.PROYECTO.IA.services.sensorServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class sensorController {
    private static final Logger logger = LoggerFactory.getLogger(sensorController.class);
    @Autowired
    private sensorServices sensorServices;
    @GetMapping("/Sensores")
    public String Sensores(Model model){
        List<Sensor> sensores = sensorServices.getAllSensors();
        logger.info("Numero de sensores: {}", sensores.size());
        for (Sensor sensor : sensores) {
            logger.info("sensor encontrado id: {}, nombre:{}, tipo :{}",sensor.getIdSensores(),sensor.getName(),sensor.getSensorType());
        }
        model.addAttribute("sensores",sensores);
        return "Sensores";
    }
    @GetMapping("/api/promedio_humedad")
    @ResponseBody
    public double getPromedioHumedad(){
        List<Sensor> sensores = sensorServices.getAllSensors();
        if(sensores.isEmpty()){
            return 0.0;
        }
        double sumHumedad = sensores.stream().filter(sensor -> sensor.getSensorType() != null && sensor.getSensorType().toString().toLowerCase().contains("humidity")).mapToDouble(Sensor::getBateria).sum();
        System.out.println("SENSORES DE HUMEDAD"+sumHumedad);
        long cantSensoresHumedad = sensores.stream().filter(sensor -> sensor.getSensorType() != null && sensor.getSensorType().toString().toLowerCase().contains("humidity")).count();
        return Math.round(sumHumedad/cantSensoresHumedad);
    }




}
