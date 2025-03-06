package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.EntidadInversion;
import com.breakingns.ProyectoInteresCompuesto.service.EntidadInversionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entidadInversion")
public class EntidadInversionController {
    
    @Autowired
    public EntidadInversionService serv;
    
    @PostMapping("/crear")
    public void crearEntidadInversion(@RequestBody EntidadInversion entidadInversion){
        
        serv.saveEntidadInversion(entidadInversion);
        
    }
    
    @GetMapping()
    public List<EntidadInversion> traerEntidadesInversiones(){
        
        return serv.getEntidadInversion();
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarEntidadInversion(@PathVariable Long id){
        serv.deleteEntidadInversion(id);
    }
}
