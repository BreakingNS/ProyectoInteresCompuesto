package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.Entidad;
import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.IEntidadRepository;
import com.breakingns.ProyectoInteresCompuesto.repository.ITipoInversionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadService implements IEntidadService{
    
    @Autowired
    private IEntidadRepository entiRepository;
    
    @Autowired
    private ITipoInversionRepository tipoInvRepository;

    @Override
    public List<Entidad> getEntidad() {
        return entiRepository.findAll();
    }

    @Override
    public void saveEntidad(Entidad enti) {
        entiRepository.save(enti);
    }

    @Override
    public void deleteEntidad(Long id) {
        entiRepository.deleteById(id);
    }

    @Override
    public Entidad findEntidad(Long id) {
        return entiRepository.findById(id).orElse(null);
    }

    @Override
    public Entidad editEntidad(Long idOriginal, String nombre_entidadNuevo, String tipoInversionNuevo) {
        
        Entidad entidadModificada = this.findEntidad(idOriginal);
        
        if(nombre_entidadNuevo != null){
            entidadModificada.setNombre_entidad(nombre_entidadNuevo);
        }

        if(tipoInversionNuevo != null){
            Long idTipo = Long.valueOf(tipoInversionNuevo);
            
            Optional<TipoInversion> tipoInversionOpt = tipoInvRepository.findById(idTipo);
            tipoInversionOpt.ifPresent(entidadModificada::setTipoInversion);

            /*
            List<TipoInversion> listaTipoInversiones = tipoInvService.getTipoInversion();
            
            for(TipoInversion tipoInv : listaTipoInversiones){
                
                if(idTipo.equals(tipoInv.getId_tipo_inversion()) ){
                    
                    entidadModificada.setTipoInversion(tipoInv);
                    
                }
                
            }
            */
        }
        
        this.saveEntidad(entidadModificada);
        
        return entidadModificada;
    }
    
}
