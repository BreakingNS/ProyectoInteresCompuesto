package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
@EqualsAndHashCode
public class NegocioGastoId implements Serializable{
    
    @Column(nullable = false)
    private Long id_negocio;
    @Column(nullable = false)
    private Long id_gasto;
    
    public NegocioGastoId() {
    }

    public NegocioGastoId(Long id_negocio, Long id_gasto) {
        this.id_negocio = id_negocio;
        this.id_gasto = id_gasto;
    }
    
}
