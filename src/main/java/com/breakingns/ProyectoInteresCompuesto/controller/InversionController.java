package com.breakingns.ProyectoInteresCompuesto.controller;
/*
import com.breakingns.ProyectoInteresCompuesto.model.Inversion;
import com.breakingns.ProyectoInteresCompuesto.service.IInversionService;
import java.time.LocalDateTime;
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
@RequestMapping("/inversion")
public class InversionController {

    @Autowired
    private IInversionService repo;
    
    @PostMapping("/crear")
    public void nuevaInversion(@RequestBody Inversion inversion){
        
        repo.saveInversion(inversion);
        
    }
    
    @GetMapping
    public List<Inversion> listarInversiones(){
        
        return repo.getInversion();
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarInversion(@PathVariable Long id){
        
        repo.deleteInversion(id);
        
    }
    
    @PutMapping("/editar/{id_original}")
    public Inversion editarInversion(@PathVariable Long id_original,
                                        @RequestParam(required = false, name = "nombre_inversion") String nuevoNombre,
                                        @RequestParam(required = false, name = "fecha_inicio") LocalDateTime fecha_inicioNuevo,
                                        @RequestParam(required = false, name = "cantidad_entidades") Integer cantidad_entidadesNuevo,
                                        @RequestParam(required = false, name = "totalCapital") Double totalCapitalNuevo){
        
        return repo.editInversion(id_original, nuevoNombre, fecha_inicioNuevo, cantidad_entidadesNuevo, totalCapitalNuevo);
        
    }
    
}
*/