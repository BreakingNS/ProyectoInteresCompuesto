package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import com.breakingns.ProyectoInteresCompuesto.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuRepository;
    
    @Override
    public List<Usuario> getUsuario() {
        return usuRepository.findAll();
    }

    @Override
    public void saveUsuario(Usuario usu) {
        usuRepository.save(usu);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        return usuRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario editUsuario(Long id_original, /*Long nuevaId,*/ String nuevoNombreUsuario, String nuevaContrasenia, String nuevoCorreo) {
        
        Usuario usu = this.findUsuario(id_original);
        
        /*usu.setId_usuario(nuevaId);*/
        usu.setNombre_usuario(nuevoNombreUsuario);
        usu.setContrasenia(nuevaContrasenia);
        usu.setCorreo(nuevoCorreo);
        
        this.saveUsuario(usu);
        
        return usu;
    }
    
}
