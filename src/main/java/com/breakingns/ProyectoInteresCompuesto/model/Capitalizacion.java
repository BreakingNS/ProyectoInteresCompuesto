package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Capitalizacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_capitalizacion;
    private String nombre_capitalizacion;
    
    @OneToMany(mappedBy = "capitalizacion")
    private List<Calculadora> calculo;

    public Capitalizacion() {
    }

    public Capitalizacion(Long id_capitalizacion, String nombre_capitalizacion, List<Calculadora> calculo) {
        this.id_capitalizacion = id_capitalizacion;
        this.nombre_capitalizacion = nombre_capitalizacion;
        this.calculo = calculo;
    }

}
