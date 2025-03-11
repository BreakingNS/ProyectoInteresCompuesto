package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.DTO.UsuarioDTO;
import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<UsuarioDTO> getUsuario();
    public void saveUsuario(Usuario usu);
    public void deleteUsuario(Long id);
    public UsuarioDTO findUsuario(Long id); 
    public Usuario editUsuario(Long id_original, /*Long nuevaId,*/ String nuevoNombreUsuario, String nuevaContrasenia, String nuevoCorreo);
}
