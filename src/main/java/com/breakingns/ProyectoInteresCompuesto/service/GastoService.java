package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Gasto;
import com.breakingns.ProyectoInteresCompuesto.repository.IGastoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService implements IGastoService{

    @Autowired
    public IGastoRepository repo;
    
    @Override
    public List<Gasto> getGasto() {
        return repo.findAll();
    }

    @Override
    public void saveGasto(Gasto gasto) {
        repo.save(gasto);
    }

    @Override
    public void deleteGasto(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Gasto findGasto(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
