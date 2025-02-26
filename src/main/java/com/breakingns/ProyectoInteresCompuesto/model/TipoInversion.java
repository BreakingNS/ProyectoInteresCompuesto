package com.breakingns.ProyectoInteresCompuesto.model;

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
@Table(name = "tipo_inversiones")
@Getter @Setter
public class TipoInversion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tipo_inversion;
    private String nombre_tipo_inversion;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "tipoInversion")
    private List<Entidad> listaEntidades;

    public TipoInversion() {
    }

    public TipoInversion(Long id_tipo_inversion, String nombre_tipo_inversion, Usuario usuario, List<Entidad> listaEntidades) {
        this.id_tipo_inversion = id_tipo_inversion;
        this.nombre_tipo_inversion = nombre_tipo_inversion;
        this.usuario = usuario;
        this.listaEntidades = listaEntidades;
    }
    
}
