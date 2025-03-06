package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import com.breakingns.ProyectoInteresCompuesto.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuService;
    
    @PostMapping("crear")
    public String nuevoUsuario(@RequestBody Usuario usuario){
        usuService.saveUsuario(usuario);
        return "El Usuario fue creado correctamente";
        /*
        try {
            usuService.saveUsuario(usuario);
            return ResponseEntity.ok("EntidadInversion creada correctamente");
        } catch (Exception e) {
            e.printStackTrace(); // Muestra el error en la consola
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la EntidadInversion: " + e.getMessage());
        }
        */
    }
    
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuService.getUsuario();
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteUsuario(@PathVariable Long id){
        usuService.deleteUsuario(id);
        return "El usuario fue eliminado correctamente";
    }
    
    @PutMapping("/editar/{id_original}")
    public Usuario editUsuario(@PathVariable Long id_original,
                                //@RequestParam(required = false, name = "id_usuario") Long nuevaId,
                                @RequestParam(required = false, name = "nombre_usuario") String nuevoNombre,
                                @RequestParam(required = false, name = "contrasenia") String nuevaContrasenia,
                                @RequestParam(required = false, name = "correo") String nuevoCorreo){
        
        return usuService.editUsuario(id_original, /*nuevaId,*/ nuevoNombre, nuevaContrasenia, nuevoCorreo);
        
    }
    
    
}
