package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Basic;
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

@Entity
@Table(name = "Inversiones")
@Getter @Setter
public class Inversion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_inversion;
    @Basic
    private String nombre_inversion;
    private LocalDateTime fecha_inicio;
    private Integer cantidad_entidades;
    private Double total_capital;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @OneToMany(mappedBy = "inversion")
    private List<EntidadInversion> listaEntidadInversion;

    public Inversion() {
    }

    public Inversion(Long id_inversion, String nombre_inversion, LocalDateTime fecha_inicio, Integer cantidad_entidades, Double total_capital, Usuario usuario, List<EntidadInversion> listaEntidadInversion) {
        this.id_inversion = id_inversion;
        this.nombre_inversion = nombre_inversion;
        this.fecha_inicio = fecha_inicio;
        this.cantidad_entidades = cantidad_entidades;
        this.total_capital = total_capital;
        this.usuario = usuario;
        this.listaEntidadInversion = listaEntidadInversion;
    }
    
}
