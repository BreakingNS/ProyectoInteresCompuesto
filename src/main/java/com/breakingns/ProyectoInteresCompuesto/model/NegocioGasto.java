package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class NegocioGasto {
    
    @Id
    private Long id_negocio_gasto;
    
    private Date fecha_mes_anio;
    
    @ManyToOne
    @JoinColumn(name = "id_negocio")
    private Negocio negocio;
    
    @ManyToOne
    @JoinColumn(name = "id_gasto")
    private Gasto gasto;

    public NegocioGasto() {
    }

    public NegocioGasto(Long id_negocio_gasto, Date fecha_mes_anio, Negocio negocio, Gasto gasto) {
        this.id_negocio_gasto = id_negocio_gasto;
        this.fecha_mes_anio = fecha_mes_anio;
        this.negocio = negocio;
        this.gasto = gasto;
    }
    
}
