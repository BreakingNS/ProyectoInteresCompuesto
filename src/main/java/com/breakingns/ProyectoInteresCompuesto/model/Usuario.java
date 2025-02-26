package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuarios")
@Getter @Setter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_usuario;
    @Basic
    private String nombre_usuario;
    private String contrasenia;
    private String correo;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inversion> listaInversiones;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Calculadora> listaCalculos;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Negocio> listaNegocios;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoInversion> listaTipoInversiones;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entidad> listaEntidades;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gasto> listaGastos;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NombreGasto> listaNombreGastos;
    
    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombre_usuario, String contrasenia, String correo, List<Inversion> listaInversiones, List<Calculadora> listaCalculos, List<Negocio> listaNegocios, List<TipoInversion> listaTipoInversiones, List<Entidad> listaEntidades, List<Gasto> listaGastos, List<NombreGasto> listaNombreGastos) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.listaInversiones = listaInversiones;
        this.listaCalculos = listaCalculos;
        this.listaNegocios = listaNegocios;
        this.listaTipoInversiones = listaTipoInversiones;
        this.listaEntidades = listaEntidades;
        this.listaGastos = listaGastos;
        this.listaNombreGastos = listaNombreGastos;
    }
}