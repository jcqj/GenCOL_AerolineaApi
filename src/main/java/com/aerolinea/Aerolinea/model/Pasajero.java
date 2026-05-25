package com.aerolinea.Aerolinea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pasajeros")
public class Pasajero
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pasajero;

    @Column(nullable = false)
    private String nombre_pasajero;
    @Column(nullable = false)
    private String apellido_pasajero;
    @Column(nullable = false)
    private String documento_pasajero;
    @Column(nullable = false)
    private String email_pasajero;

    public Pasajero(){}

    public Pasajero(Long id_pasajero, String nombre_pasajero, String apellido_pasajero, String documento_pasajero, String email_pasajero) {
        this.id_pasajero = id_pasajero;
        this.nombre_pasajero = nombre_pasajero;
        this.apellido_pasajero = apellido_pasajero;
        this.documento_pasajero = documento_pasajero;
        this.email_pasajero = email_pasajero;
    }

    public Long getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(Long id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    public String getApellido_pasajero() {
        return apellido_pasajero;
    }

    public void setApellido_pasajero(String apellido_pasajero) {
        this.apellido_pasajero = apellido_pasajero;
    }

    public String getDocumento_pasajero() {
        return documento_pasajero;
    }

    public void setDocumento_pasajero(String documento_pasajero) {
        this.documento_pasajero = documento_pasajero;
    }

    public String getEmail_pasajero() {
        return email_pasajero;
    }

    public void setEmail_pasajero(String email_pasajero) {
        this.email_pasajero = email_pasajero;
    }
}
