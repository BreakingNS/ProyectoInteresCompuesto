package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.Negocio;
import com.breakingns.ProyectoInteresCompuesto.service.INegocioService;
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
@RequestMapping("/negocio")
public class NegocioController {
    
    @Autowired
    public INegocioService negoService;
    
    @PostMapping("/crear")
    public void nuevoNegocio(@RequestBody Negocio negocio){
        negoService.saveNegocio(negocio);
    }
    
    @GetMapping
    public List<Negocio> traerNegocios(){
        return negoService.getNegocio();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarNegocio(@PathVariable Long id){
        negoService.deleteNegocio(id);
    }
    
    @GetMapping("/{id_buscar}")
    public Negocio buscarNegocio(@PathVariable Long id){
        return negoService.findNegocio(id);
    }
}
