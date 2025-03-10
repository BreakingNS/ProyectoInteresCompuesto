package com.breakingns.ProyectoInteresCompuesto.repository;

import com.breakingns.ProyectoInteresCompuesto.model.NegocioGasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INegocioGastoRepository extends JpaRepository<NegocioGasto, Long>{
    
}
