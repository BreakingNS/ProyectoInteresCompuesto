package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.EntidadInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.IEntidadInversionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadInversionService implements IEntidadInversionService{

    @Autowired
    public IEntidadInversionRepository repo;
    
    @Override
    public List<EntidadInversion> getEntidadInversion() {
        return repo.findAll();
    }

    @Override
    public void saveEntidadInversion(EntidadInversion enti) {
        repo.save(enti);
    }

    @Override
    public void deleteEntidadInversion(Long id) {
        repo.deleteById(id);
    }

    @Override
    public EntidadInversion findEntidadInversion(Long id) {
        return repo.findById(id).orElse(null);
    }
    /*
    @Override
    public EntidadInversion editEntidadInversion(Long idOriginal, String nombre_entidadNuevo, String tipoInversionNuevo) {
        
    }
    */
    
}
