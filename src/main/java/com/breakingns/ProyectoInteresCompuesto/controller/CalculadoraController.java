
package com.breakingns.ProyectoInteresCompuesto.controller;

import com.breakingns.ProyectoInteresCompuesto.model.Calculadora;
import com.breakingns.ProyectoInteresCompuesto.service.ICalculadoraService;
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
@RequestMapping("/calculadora")
public class CalculadoraController {
    
    @Autowired
    public ICalculadoraService calcService;
    
    @PostMapping("/crear")
    public void nuevoCalculo(@RequestBody Calculadora calculo){
        
        calcService.saveCalculadora(calculo);
        
    }
    
    @GetMapping
    public List<Calculadora> traerCalculos(){
        
        return calcService.getCalculadora();
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void traerCalculos(@PathVariable Long id){
        
        calcService.deleteCalculadora(id);
        
    }
    
    @GetMapping("/{id_buscar}")
    public Calculadora buscarCalculo(@PathVariable Long id_buscar){
        
        return calcService.findCalculadora(id_buscar);
        
    }
    
}
