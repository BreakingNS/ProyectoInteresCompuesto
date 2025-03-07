package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Negocios")
public class Negocio {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_negocio;

    private String nombre_negocio;
    private LocalDateTime fecha_inicio;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
    /*
    @OneToMany(mappedBy = "negocio")
    @JsonManagedReference
    private List<NegocioGasto> listaNegociosGastos;
    */
    
    public Negocio() {
        
        this.fecha_inicio = LocalDateTime.now();
        
    }

    public Negocio(Long id_negocio, String nombre_negocio, LocalDateTime fecha_inicio, Usuario usuario) {
        this.id_negocio = id_negocio;
        this.nombre_negocio = nombre_negocio;
        this.fecha_inicio = fecha_inicio;
        this.usuario = usuario;
    }
    
}


























