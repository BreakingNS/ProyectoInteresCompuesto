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
}
