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
public class EntidadInversionId implements Serializable{
    
    @Column(nullable = false)
    private Long id_entidad;
    @Column(nullable = false)
    private Long id_inversion;
    
    public EntidadInversionId() {
    }

    public EntidadInversionId(Long id_entidad, Long id_inversion) {
        this.id_entidad = id_entidad;
        this.id_inversion = id_inversion;
    }
}
