package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "NegociosGastos")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class NegocioGasto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime fecha_mes_anio;
    
    @ManyToOne
    @JoinColumn(name = "id_negocio", /*insertable = false, updatable = false, */nullable = false)
    private Negocio negocio;
    
    @ManyToOne
    @JoinColumn(name = "id_gasto", /*insertable = false, updatable = false */nullable = false)
    private Gasto gasto;

    public NegocioGasto() {
        this.fecha_mes_anio = LocalDateTime.now();
    }

    public NegocioGasto(Long id, LocalDateTime fecha_mes_anio, Negocio negocio, Gasto gasto) {
        this.id = id;
        this.fecha_mes_anio = fecha_mes_anio;
        this.negocio = negocio;
        this.gasto = gasto;
    }

    
    
}
