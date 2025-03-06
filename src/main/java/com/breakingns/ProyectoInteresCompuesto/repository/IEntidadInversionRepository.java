package com.breakingns.ProyectoInteresCompuesto.repository;

import com.breakingns.ProyectoInteresCompuesto.model.EntidadInversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntidadInversionRepository extends JpaRepository<EntidadInversion, Long>{
    
}
