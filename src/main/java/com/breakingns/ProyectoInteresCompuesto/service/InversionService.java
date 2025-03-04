package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Inversion;
import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.IInversionRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InversionService implements IInversionService{
    
    @Autowired
    private IInversionRepository inverRepository;

    @Override
    public List<Inversion> getInversion() {
        return inverRepository.findAll();
    }

    @Override
    public void saveInversion(Inversion inver) {
        //System.out.println("tipo inversion: " + inver.getTipoInversion().getId_tipo_inversion());

        
        inverRepository.save(inver);
    }

    @Override
    public void deleteInversion(Long id) {
        inverRepository.deleteById(id);
    }

    @Override
    public Inversion findInversion(Long id) {
        return inverRepository.findById(id).orElse(null);
    }

    @Override
    public Inversion editInversion(Long id_original, String nombre_inversionNuevo, LocalDateTime fecha_inicioNuevo, Integer cantidad_entidadesNuevo, Double total_capitalNuevo) {
        
        Inversion inv = this.findInversion(id_original);
        
        inv.setNombre_inversion(nombre_inversionNuevo);
        inv.setFecha_inicio(fecha_inicioNuevo);
        inv.setCantidad_entidades(cantidad_entidadesNuevo);
        inv.setTotal_capital(total_capitalNuevo);
        
        this.saveInversion(inv);
        
        return inv;
        
    }
    
}
