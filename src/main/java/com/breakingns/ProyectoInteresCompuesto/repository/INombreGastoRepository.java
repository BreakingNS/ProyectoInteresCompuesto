package com.breakingns.ProyectoInteresCompuesto.repository;

import com.breakingns.ProyectoInteresCompuesto.model.NombreGasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INombreGastoRepository extends JpaRepository<NombreGasto, Long>{
    
}
