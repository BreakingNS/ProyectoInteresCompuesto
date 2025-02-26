package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "NegociosGastos")
public class NegocioGasto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_negocio_gasto;
    
    @Embedded
    private NegocioGastoId id;
    
    private LocalDateTime fecha_mes_anio;
    
    @ManyToOne
    @JoinColumn(name = "id_negocio", insertable = false, updatable = false)
    @JsonBackReference
    private Negocio negocio;
    
    @ManyToOne
    @JoinColumn(name = "id_gasto", insertable = false, updatable = false)
    @JsonBackReference
    private Gasto gasto;

    public NegocioGasto() {
    }

    public NegocioGasto(Long id_negocio_gasto, NegocioGastoId id, LocalDateTime fecha_mes_anio, Negocio negocio, Gasto gasto) {
        this.id_negocio_gasto = id_negocio_gasto;
        this.id = id;
        this.fecha_mes_anio = fecha_mes_anio;
        this.negocio = negocio;
        this.gasto = gasto;
    }
    
}
