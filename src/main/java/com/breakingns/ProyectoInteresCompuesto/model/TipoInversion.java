package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class TipoInversion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tipo_inversion;
    private String nombre_tipo_inversion;
    
    @OneToMany(mappedBy = "tipoInversion")
    private List<Entidad> listaEntidadInversiones;

    public TipoInversion() {
    }

    public TipoInversion(Long id_tipo_inversion, String nombre_tipo_inversion, List<Entidad> listaEntidadInversiones) {
        this.id_tipo_inversion = id_tipo_inversion;
        this.nombre_tipo_inversion = nombre_tipo_inversion;
        this.listaEntidadInversiones = listaEntidadInversiones;
    }
    
}
