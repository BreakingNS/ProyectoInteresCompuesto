package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import java.util.List;

public interface ITipoInversionService {
    
    public List<TipoInversion> getTipoInversion();
    public void saveTipoInversion(TipoInversion tipoInv);
    public void deleteTipoInversion(Long id);
    public TipoInversion findTipoInversion(Long id);
    
}
