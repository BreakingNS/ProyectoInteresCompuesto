package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.EntidadInversion;
import java.util.List;

public interface IEntidadInversionService {
    
    public List<EntidadInversion> getEntidadInversion();
    public void saveEntidadInversion(EntidadInversion enti);
    public void deleteEntidadInversion(Long id);
    public EntidadInversion findEntidadInversion(Long id);
    //public EntidadInversion editEntidadInversion(Long idOriginal, String nombre_entidadNuevo, String tipoInversionNuevo);
    
}
