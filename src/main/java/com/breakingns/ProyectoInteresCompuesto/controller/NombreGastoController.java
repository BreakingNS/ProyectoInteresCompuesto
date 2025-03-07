package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.NombreGasto;
import com.breakingns.ProyectoInteresCompuesto.service.INombreGastoService;
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
@RequestMapping("/nombreGasto")
public class NombreGastoController {
    
    @Autowired
    public INombreGastoService nGastoService;
    
    @PostMapping("/crear")
    public void nuevoNombreGasto(@RequestBody NombreGasto nombreGasto){
        nGastoService.saveNombreGasto(nombreGasto);
    }
    
    @GetMapping
    public List<NombreGasto> traerNombreGastos(){
        return nGastoService.getNombreGasto();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarNombreGasto(@PathVariable Long id){
        nGastoService.deleteNombreGasto(id);
    }
    
    @GetMapping("/{id_buscar}")
    public NombreGasto buscarNombreGasto(@PathVariable Long id){
        return nGastoService.findNombreGasto(id);
    }
    
}
