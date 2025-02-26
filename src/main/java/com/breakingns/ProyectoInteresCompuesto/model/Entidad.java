package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Entidades")
@Getter @Setter
public class Entidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_entidad;
    private String nombre_entidad;
    
    @OneToMany(mappedBy = "entidad")
    @JsonManagedReference
    private List<EntidadInversion> listaEntidadInversion;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_inversion")
    private TipoInversion tipoInversion;
    
    public Entidad() {
    }

    public Entidad(Long id_entidad, String nombre_entidad, List<EntidadInversion> listaEntidadInversion, Usuario usuario, TipoInversion tipoInversion) {
        this.id_entidad = id_entidad;
        this.nombre_entidad = nombre_entidad;
        this.listaEntidadInversion = listaEntidadInversion;
        this.usuario = usuario;
        this.tipoInversion = tipoInversion;
    }
}
