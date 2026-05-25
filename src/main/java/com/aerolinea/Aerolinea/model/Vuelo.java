package com.aerolinea.Aerolinea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vuelos")
public class Vuelo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vuelo;

    @Column
    private String origen;

}
