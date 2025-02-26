package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EntidadesInversiones")
@Getter @Setter
public class EntidadInversion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_entidad_inversion;
    
    @Embedded
    private EntidadInversionId entidadInversionId;
    
    private Double monto_invertido;
    private LocalDateTime fecha_inversion;
    
    @ManyToOne
    @JoinColumn(name = "id_entidad", insertable = false, updatable = false)
    @JsonBackReference
    private Entidad entidad;

    @ManyToOne
    @JoinColumn(name = "id_inversion", insertable = false, updatable = false)
    private Inversion inversion;
    
    public EntidadInversion() {
    }

    public EntidadInversion(Long id_entidad_inversion, EntidadInversionId entidadInversionId, Double monto_invertido, LocalDateTime fecha_inversion, Entidad entidad, Inversion inversion) {
        this.id_entidad_inversion = id_entidad_inversion;
        this.entidadInversionId = entidadInversionId;
        this.monto_invertido = monto_invertido;
        this.fecha_inversion = fecha_inversion;
        this.entidad = entidad;
        this.inversion = inversion;
    }
   
}
