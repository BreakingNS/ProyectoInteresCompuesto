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
public class Negocio {
     
    @Id
    private Long id_negocio;

    private String nombre_negocio;
    private Date fecha_inicio;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "negocio")
    private List<NegocioGasto> listaNegociosGastos;

    public Negocio() {
    }

    public Negocio(Long id_negocio, String nombre_negocio, Date fecha_inicio, Usuario usuario, List<NegocioGasto> listaNegociosGastos) {
        this.id_negocio = id_negocio;
        this.nombre_negocio = nombre_negocio;
        this.fecha_inicio = fecha_inicio;
        this.usuario = usuario;
        this.listaNegociosGastos = listaNegociosGastos;
    }
    
}


























