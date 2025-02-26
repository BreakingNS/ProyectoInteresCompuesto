package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Gastos")
public class Gasto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_gasto;
    
    private Double monto_gasto;
    private LocalDateTime fecha_gasto;
    private String detalle;
    
    @OneToMany(mappedBy = "gasto")
    private List<NegocioGasto> listaNegocioGastos;
    
    @ManyToOne
    @JoinColumn(name = "id_nombre_gasto")
    private NombreGasto nombre_gasto;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Gasto() {
    }

    public Gasto(Long id_gasto, Double monto_gasto, LocalDateTime fecha_gasto, String detalle, List<NegocioGasto> listaNegocioGastos, NombreGasto nombre_gasto, Usuario usuario) {
        this.id_gasto = id_gasto;
        this.monto_gasto = monto_gasto;
        this.fecha_gasto = fecha_gasto;
        this.detalle = detalle;
        this.listaNegocioGastos = listaNegocioGastos;
        this.nombre_gasto = nombre_gasto;
        this.usuario = usuario;
    }
}
