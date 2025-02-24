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
    
}


























