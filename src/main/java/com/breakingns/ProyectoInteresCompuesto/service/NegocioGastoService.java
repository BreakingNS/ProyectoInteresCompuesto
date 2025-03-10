package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.NegocioGasto;
import com.breakingns.ProyectoInteresCompuesto.repository.INegocioGastoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioGastoService implements INegocioGastoService{

    @Autowired
    public INegocioGastoRepository repo;
    
    @Override
    public List<NegocioGasto> getNegocioGasto() {
        return repo.findAll();
    }

    @Override
    public void saveNegocioGasto(NegocioGasto negoGas) {
        repo.save(negoGas);
    }

    @Override
    public void deleteNegocioGasto(Long id) {
        repo.deleteById(id);
    }

    @Override
    public NegocioGasto findNegocioGasto(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
