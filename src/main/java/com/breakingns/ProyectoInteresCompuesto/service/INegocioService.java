package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Negocio;
import java.util.List;

public interface INegocioService {
    
    public List<Negocio> getNegocio();
    public void saveNegocio(Negocio nego);
    public void deleteNegocio(Long id);
    public Negocio findNegocio(Long id);
    
}
