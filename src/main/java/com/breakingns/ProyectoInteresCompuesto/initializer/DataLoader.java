package com.breakingns.ProyectoInteresCompuesto.initializer;

import com.breakingns.ProyectoInteresCompuesto.model.Capitalizacion;
import com.breakingns.ProyectoInteresCompuesto.model.TipoCapitalizacion;
import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import com.breakingns.ProyectoInteresCompuesto.model.TipoTipoInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.ICapitalizacionRepository;
import com.breakingns.ProyectoInteresCompuesto.repository.ITipoInversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    private ITipoInversionRepository tipoInversionRepo;
    
    @Autowired
    private ICapitalizacionRepository capitalizacionRepo;
    
    @Override
    public void run(String... args) {
        if (tipoInversionRepo.count() == 0) { // Evita duplicados
            for (TipoTipoInversion tipo : TipoTipoInversion.values()) {
                TipoInversion tipoInv = new TipoInversion();
                tipoInv.setTipoTipoInversion(tipo);
                tipoInversionRepo.save(tipoInv);
            }
            System.out.println("Tipos de Inversiones cargadas en la BD.");
        }
        
        if (capitalizacionRepo.count() == 0) { // Evita duplicados
            for (TipoCapitalizacion tipo : TipoCapitalizacion.values()) {
                Capitalizacion cap = new Capitalizacion();
                cap.setTipoCapitalizacion(tipo);
                capitalizacionRepo.save(cap);
            }
            System.out.println("Capitalizaciones cargadas en la BD.");
        }
    }
    
    
}


