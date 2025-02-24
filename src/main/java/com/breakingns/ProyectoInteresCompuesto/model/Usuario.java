package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Basic;
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
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_usuario;
    @Basic
    private String usuario;
    private String contrasenia;
    private String correo;
    
    @OneToMany(mappedBy = "usuario")
    private List<Inversion> listaInversiones;
    
    @OneToMany(mappedBy = "usuario")
    private List<Calculadora> listaCalculos;
    
    @OneToMany(mappedBy = "usuario")
    private List<Negocio> listaNegocio;

    public Usuario() {
    }
    
    
    

}