package com.breakingns.ProyectoInteresCompuesto.repository;

import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoInversionRepository extends JpaRepository<TipoInversion, Long>{
    
}
