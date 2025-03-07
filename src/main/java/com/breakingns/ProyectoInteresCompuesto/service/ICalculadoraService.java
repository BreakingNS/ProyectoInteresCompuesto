package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Calculadora;
import java.util.List;

public interface ICalculadoraService {
    
    public List<Calculadora> getCalculadora();
    public void saveCalculadora(Calculadora calc);
    public void deleteCalculadora(Long id);
    public Calculadora findCalculadora(Long id);
    
}
