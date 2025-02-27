package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> getUsuario();
    public void saveUsuario(Usuario usu);
    public void deleteUsuario(Long id);
    public Usuario findUsuario(Long id); 
    public Usuario editUsuario(Long id_original, /*Long nuevaId,*/ String nuevoNombreUsuario, String nuevaContrasenia, String nuevoCorreo);
}
