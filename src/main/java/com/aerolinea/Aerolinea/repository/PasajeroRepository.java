package com.aerolinea.Aerolinea.repository;


import com.aerolinea.Aerolinea.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {
}
