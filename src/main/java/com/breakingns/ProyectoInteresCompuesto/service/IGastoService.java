package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Gasto;
import java.util.List;

public interface IGastoService {
    
    public List<Gasto> getGasto();
    public void saveGasto(Gasto gasto);
    public void deleteGasto(Long id);
    public Gasto findGasto(Long id);
    
}
