package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "tipo_inversiones")
@Getter @Setter
public class TipoInversion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tipo_inversion;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "nombre_tipo_inversion")
    private TipoTipoInversion tipoTipoInversion; 
    
    @OneToMany(mappedBy = "tipoInversion")
    @JsonBackReference("tipoInversion-entidad")
    private List<Entidad> listaEntidades;
    
    public TipoInversion() {
    }

    public TipoInversion(Long id_tipo_inversion, TipoTipoInversion tipoTipoInversion, List<Entidad> listaEntidades) {
        this.id_tipo_inversion = id_tipo_inversion;
        this.tipoTipoInversion = tipoTipoInversion;
        this.listaEntidades = listaEntidades;
    }
    
}

