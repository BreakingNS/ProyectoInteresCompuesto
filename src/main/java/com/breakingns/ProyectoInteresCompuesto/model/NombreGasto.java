package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class NombreGasto {
    
    @Id
    private Long id_nombre_gasto;
    
    private String nombre_gasto;
    
    @OneToMany(mappedBy = "nombre_gasto")
    private List<Gasto> listaGastos;
    
}
