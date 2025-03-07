package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Calculadora;
import com.breakingns.ProyectoInteresCompuesto.repository.ICalculadoraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService{

    @Autowired
    public ICalculadoraRepository repo;
    
    @Override
    public List<Calculadora> getCalculadora() {
        return repo.findAll();
    }

    @Override
    public void saveCalculadora(Calculadora calc) {
        repo.save(calc);
    }

    @Override
    public void deleteCalculadora(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Calculadora findCalculadora(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
