package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.Gasto;
import com.breakingns.ProyectoInteresCompuesto.model.Gasto;
import com.breakingns.ProyectoInteresCompuesto.service.IGastoService;
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
@RequestMapping("/gasto")
public class GastoController {
    
    @Autowired
    public IGastoService gastoService;
    
    @PostMapping("/crear")
    public void nuevoGasto(@RequestBody Gasto gasto){
        gastoService.saveGasto(gasto);
    }
    
    @GetMapping
    public List<Gasto> traerGastos(){
        return gastoService.getGasto();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarGasto(@PathVariable Long id){
        gastoService.deleteGasto(id);
    }
    
    @GetMapping("/{id_buscar}")
    public Gasto buscarGasto(@PathVariable Long id){
        return gastoService.findGasto(id);
    }
    
}
