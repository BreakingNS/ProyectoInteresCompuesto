package com.breakingns.ProyectoInteresCompuesto.repository;

import com.breakingns.ProyectoInteresCompuesto.model.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INegocioRepository extends JpaRepository<Negocio, Long>{
    
}
