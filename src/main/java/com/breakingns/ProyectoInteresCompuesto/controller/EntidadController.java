package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.Entidad;
import com.breakingns.ProyectoInteresCompuesto.service.IEntidadService;
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
@RequestMapping("/entidad")
public class EntidadController {
    
    @Autowired
    private IEntidadService entiService;
    
    @PostMapping("/crear")
    public void nuevaEntidad(@RequestBody Entidad entidad){
        
        entiService.saveEntidad(entidad);
        
    }
    
    @GetMapping
    public List<Entidad> listarEntidades(){
        
        return entiService.getEntidad();
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarEntidad(@PathVariable Long id){
        
        entiService.deleteEntidad(id);
        
    }
    
    @PutMapping("/editar/{id_original}")
    public Entidad modificarEntidad(@PathVariable Long id_original,
                                    @RequestParam(required = false, name = "nombre_entidad") String nombre_entidadNuevo,
                                    @RequestParam(required = false, name = "tipoInversion") String tipoInversionNuevo){
        
        return entiService.editEntidad(id_original, nombre_entidadNuevo, tipoInversionNuevo);
        
    }
}
