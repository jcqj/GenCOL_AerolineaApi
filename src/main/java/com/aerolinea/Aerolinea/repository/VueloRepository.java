package com.aerolinea.Aerolinea.repository;

import com.aerolinea.Aerolinea.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long>{

}
