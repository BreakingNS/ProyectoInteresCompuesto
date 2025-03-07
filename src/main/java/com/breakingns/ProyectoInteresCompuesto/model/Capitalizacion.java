package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "capitalizaciones")
@Getter @Setter
public class Capitalizacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_capitalizacion;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "nombre_capitalizacion")
    private TipoCapitalizacion tipoCapitalizacion; 
    
    @OneToMany(mappedBy = "capitalizacion")
    @JsonIgnore
    private List<Calculadora> listaCalculos;
    
    public Capitalizacion() {
    }

    public Capitalizacion(Long id_capitalizacion, TipoCapitalizacion tipoCapitalizacion, List<Calculadora> listaCalculos) {
        this.id_capitalizacion = id_capitalizacion;
        this.tipoCapitalizacion = tipoCapitalizacion;
        this.listaCalculos = listaCalculos;
    }

}

