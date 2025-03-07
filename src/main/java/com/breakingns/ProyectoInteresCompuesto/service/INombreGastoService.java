package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.NombreGasto;
import java.util.List;

public interface INombreGastoService {
    
    public List<NombreGasto> getNombreGasto();
    public void saveNombreGasto(NombreGasto nego);
    public void deleteNombreGasto(Long id);
    public NombreGasto findNombreGasto(Long id);
    
}
