package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.NegocioGasto;
import java.util.List;

public interface INegocioGastoService {
    
    public List<NegocioGasto> getNegocioGasto();
    public void saveNegocioGasto(NegocioGasto negoGas);
    public void deleteNegocioGasto(Long id);
    public NegocioGasto findNegocioGasto(Long id);
    
}
