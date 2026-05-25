package com.aerolinea.Aerolinea.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vuelos")
public class Vuelo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vuelo;

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Enumerated(EnumType.STRING)
    private EstadoVuelo estado;

    public Vuelo(){}

    public Vuelo(Long id_vuelo, String origen, String destino, LocalDateTime fechaHora, EstadoVuelo estado) {
        this.id_vuelo = id_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Long getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(Long id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public EstadoVuelo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVuelo estado) {
        this.estado = estado;
    }
}
