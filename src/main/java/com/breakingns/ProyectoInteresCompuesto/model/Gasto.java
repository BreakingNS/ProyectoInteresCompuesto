package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Gasto {
    
    @Id
    private Long id_gasto;
    
    private Double monto_gasto;
    private Date fecha_gasto;
    private String detalle;
    
    @OneToMany(mappedBy = "gasto")
    private List<NegocioGasto> listaNegocioGastos;
    
    @ManyToOne
    @JoinColumn(name = "id_nombre_gasto")
    private NombreGasto nombre_gasto;

    public Gasto() {
    }
    
    public Gasto(Long id_gasto, Double monto_gasto, Date fecha_gasto, String detalle, List<NegocioGasto> listaNegocioGastos, NombreGasto nombre_gasto) {
        this.id_gasto = id_gasto;
        this.monto_gasto = monto_gasto;
        this.fecha_gasto = fecha_gasto;
        this.detalle = detalle;
        this.listaNegocioGastos = listaNegocioGastos;
        this.nombre_gasto = nombre_gasto;
    }
    
}
