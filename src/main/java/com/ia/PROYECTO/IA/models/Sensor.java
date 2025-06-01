package com.ia.PROYECTO.IA.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="sensores")
public class Sensor {
    @Id
    @Column(name="idSensores")
    private int idSensores;
    @Column(name="idZona")
    private int idZona;
    @Column(name="Bateria")
    private int bateria;
    @Column(name="Estado")
    private boolean estado;
    @Column(name="UltimaActualizacion")
    private LocalDateTime ultimaActualizacion;
    @Column(name="name")
    private String name;
    @Column(name="sensor_type")
    @Enumerated (EnumType.STRING)
    private sensor_type sensorType;
    public enum sensor_type{
        humidity,temperature,ph,conductuvity
    }
    @Column(name="status")
    @Enumerated (EnumType.STRING)
    private status status;
    public enum status{
        active,inactive,maintenance
    }
    @Column(name="created_at")
    private LocalDateTime createdAt;

    public Sensor(){
    }

    public int getIdSensores() {
        return idSensores;
    }
    public void setIdSensores(int idSensores) {
        this.idSensores = idSensores;
    }
    public int getIdZona() {
        return idZona;
    }
    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }
    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public LocalDateTime getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    public void setUltimaActualizacion(LocalDateTime ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public sensor_type getSensorType() {
        return sensorType;
    }
    public void setSensorType(sensor_type sensorType) {
        this.sensorType = sensorType;
    }
    public status getStatus() {
        return status;
    }
    public void setStatus(status status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "Sensor{"+
                "IdSensor="+idSensores+
                ", idZona="+idZona+
                ", bateria="+bateria+
                ". estado="+estado+
                ", ultimaActualizacion="+ultimaActualizacion+
                ". name="+name+
                ". sensor_type"+sensorType+
                ", status"+ status+
                ", createdAt"+createdAt+"}";
    }
}

