package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Capitalizacion;
import com.breakingns.ProyectoInteresCompuesto.repository.ICapitalizacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapitalizacionService implements ICapitalizacionService{

    @Autowired
    private ICapitalizacionRepository repo;
    
    @Override
    public List<Capitalizacion> getCapitalizacion() {
        return repo.findAll();
    }

    @Override
    public void saveCapitalizacion(Capitalizacion capi) {
        repo.save(capi);
    }

    @Override
    public void deleteCapitalizacion(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Capitalizacion findCapitalizacion(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
