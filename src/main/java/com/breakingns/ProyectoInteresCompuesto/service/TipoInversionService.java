package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.ITipoInversionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoInversionService implements ITipoInversionService{

    @Autowired
    private ITipoInversionRepository repo;
    
    @Override
    public List<TipoInversion> getTipoInversion() {
        return repo.findAll();
    }

    @Override
    public void saveTipoInversion(TipoInversion tipoInv) {
        repo.save(tipoInv);
    }

    @Override
    public void deleteTipoInversion(Long id) {
        repo.deleteById(id);
    }

    @Override
    public TipoInversion findTipoInversion(Long id) {
        return repo.findById(id).orElse(null);
    }

}
