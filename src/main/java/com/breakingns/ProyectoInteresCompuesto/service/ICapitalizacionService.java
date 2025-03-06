package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Capitalizacion;
import java.util.List;

public interface ICapitalizacionService {
    
    public List<Capitalizacion> getCapitalizacion();
    public void saveCapitalizacion(Capitalizacion capi);
    public void deleteCapitalizacion(Long id);
    public Capitalizacion findCapitalizacion(Long id);
    
}
