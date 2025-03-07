package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Entidad;
import java.util.List;

public interface IEntidadService {
    
    public List<Entidad> getEntidad();
    public void saveEntidad(Entidad enti);
    public void deleteEntidad(Long id);
    public Entidad findEntidad(Long id);
    public Entidad editEntidad(Long idOriginal, String nombre_entidadNuevo, String tipoInversionNuevo);
    
}
