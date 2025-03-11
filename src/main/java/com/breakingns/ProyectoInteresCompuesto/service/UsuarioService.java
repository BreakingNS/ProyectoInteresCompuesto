package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.DTO.UsuarioDTO;
import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import com.breakingns.ProyectoInteresCompuesto.repository.IUsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuRepository;
    
    @Override
    public List<UsuarioDTO> getUsuario() {
        List<Usuario> listaUsuarios = usuRepository.findAll();
        List<UsuarioDTO> listaUsuariosDTO= new ArrayList<>();
        
        for(Usuario usu: listaUsuarios){
            UsuarioDTO usuDto = new UsuarioDTO();
            usuDto.setId_usuario(usu.getId_usuario());
            usuDto.setNombre_usuario(usu.getNombre_usuario());
            usuDto.setCorreo(usu.getCorreo());
            
            listaUsuariosDTO.add(usuDto);
        }
        
        return listaUsuariosDTO;
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
    public UsuarioDTO findUsuario(Long id) {
        Usuario usu = usuRepository.findById(id).orElse(null);
        
        if(usu == null){
            return null;
        }
        
        UsuarioDTO usuDTO = new UsuarioDTO();
        usuDTO.setId_usuario(usu.getId_usuario());
        usuDTO.setNombre_usuario(usu.getNombre_usuario());
        usuDTO.setCorreo(usu.getCorreo());
        
        return usuDTO;
    }
    
    @Override
    public Usuario editUsuario(Long id_original, /*Long nuevaId,*/ String nuevoNombreUsuario, String nuevaContrasenia, String nuevoCorreo) {
        
        Usuario usu = usuRepository.findById(id_original).orElse(null);
        
        /*usu.setId_usuario(nuevaId);*/
        usu.setNombre_usuario(nuevoNombreUsuario);
        usu.setContrasenia(nuevaContrasenia);
        usu.setCorreo(nuevoCorreo);
        
        this.saveUsuario(usu);
        
        return usu;
    }
    
}
