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
public class Entidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_entidad;
    private String nombre_entidad;
    
    @OneToMany(mappedBy = "entidad")
    private List<EntidadInversion> listaEntidadInversion;
    
    @ManyToOne
    @JoinColumn(name = "tipo_inversion_id")
    private TipoInversion tipoInversion;
    
    public Entidad() {
    }

    public Entidad(Long id_entidad, String nombre_entidad, List<EntidadInversion> listaEntidadInversion, TipoInversion tipoInversion) {
        this.id_entidad = id_entidad;
        this.nombre_entidad = nombre_entidad;
        this.listaEntidadInversion = listaEntidadInversion;
        this.tipoInversion = tipoInversion;
    }

}
