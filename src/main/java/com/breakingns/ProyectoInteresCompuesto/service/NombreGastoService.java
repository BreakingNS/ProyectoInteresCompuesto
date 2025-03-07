package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.NombreGasto;
import com.breakingns.ProyectoInteresCompuesto.repository.INombreGastoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreGastoService implements INombreGastoService{

    @Autowired
    public INombreGastoRepository repo;
    
    @Override
    public List<NombreGasto> getNombreGasto() {
        return repo.findAll();
    }

    @Override
    public void saveNombreGasto(NombreGasto nego) {
        repo.save(nego);
    }

    @Override
    public void deleteNombreGasto(Long id) {
        repo.deleteById(id);
    }

    @Override
    public NombreGasto findNombreGasto(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
