package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.NegocioGasto;
import com.breakingns.ProyectoInteresCompuesto.service.INegocioGastoService;
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
@RequestMapping("/negocioGasto")
public class NegocioGastoController {
    
    @Autowired
    public INegocioGastoService negoService;
    
    @PostMapping("/crear")
    public void nuevoNegocioGasto(@RequestBody NegocioGasto negocioGasto){
        negoService.saveNegocioGasto(negocioGasto);
    }
    
    @GetMapping
    public List<NegocioGasto> traerNegocioGastos(){
        return negoService.getNegocioGasto();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarNegocioGasto(@PathVariable Long id){
        negoService.deleteNegocioGasto(id);
    }
    
    @GetMapping("/{id_buscar}")
    public NegocioGasto buscarNegocioGasto(@PathVariable Long id){
        return negoService.findNegocioGasto(id);
    }
    
}
