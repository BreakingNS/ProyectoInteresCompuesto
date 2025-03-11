package com.breakingns.ProyectoInteresCompuesto.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO {
    
    private Long id_usuario;
    private String nombre_usuario;
    private String correo;

    public UsuarioDTO() {
    }
    
    public UsuarioDTO(Long id_usuario, String nombre_usuario, String correo) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.correo = correo;
    }
}
