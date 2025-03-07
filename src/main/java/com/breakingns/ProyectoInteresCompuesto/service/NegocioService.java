package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Negocio;
import com.breakingns.ProyectoInteresCompuesto.repository.INegocioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioService implements INegocioService{

    @Autowired
    private INegocioRepository repo;
    
    @Override
    public List<Negocio> getNegocio() {
        return repo.findAll();
    }

    @Override
    public void saveNegocio(Negocio nego) {
        repo.save(nego);
    }

    @Override
    public void deleteNegocio(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Negocio findNegocio(Long id) {
        return repo.findById(id).orElse(null);
    }
    
    
    
}
