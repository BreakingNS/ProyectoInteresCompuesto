package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
import java.util.ArrayList;
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
    @JsonBackReference
    private Usuario usuario;
    /*
    @OneToMany(mappedBy = "inversion")
    @JsonManagedReference
    private List<EntidadInversion> listaEntidadInversion;
    */
    
    public Inversion() {
        this.fecha_inicio = LocalDateTime.now();
        this.cantidad_entidades = 0;
        this.total_capital = 0.0;
    }
    
    public Inversion(Long id_inversion,
            Usuario usuario,
            String nombre_inversion) {
        
        this.id_inversion = id_inversion;
        this.usuario = usuario;
        this.nombre_inversion = nombre_inversion;
        
        this.fecha_inicio = LocalDateTime.now();
        this.cantidad_entidades = 0;
        this.total_capital = 0.0;
        /*
        this.listaEntidadInversion = new ArrayList<>();*/
    }
    
}
