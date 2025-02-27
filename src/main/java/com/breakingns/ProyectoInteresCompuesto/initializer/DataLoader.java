package com.breakingns.ProyectoInteresCompuesto.initializer;

import com.breakingns.ProyectoInteresCompuesto.model.TipoInversion;
import com.breakingns.ProyectoInteresCompuesto.model.TipoTipoInversion;
import com.breakingns.ProyectoInteresCompuesto.repository.ITipoInversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    /*
    @Autowired
    private CapitalizacionRepository capitalizacionRepo;
    */
    
    /*
    @Override
    public void run(String... args) {
        if (capitalizacionRepo.count() == 0) { // Evita duplicados
            for (TipoCapitalizacion tipo : TipoCapitalizacion.values()) {
                Capitalizacion cap = new Capitalizacion();
                cap.setTipoCapitalizacion(tipo);
                capitalizacionRepo.save(cap);
            }
        }
    }*/
    
    @Autowired
    private ITipoInversionRepository tipoInversionRepo;
    
    @Override
    public void run(String... args) {
        if (tipoInversionRepo.count() == 0) { // Evita duplicados
            for (TipoTipoInversion tipo : TipoTipoInversion.values()) {
                TipoInversion tipoInv = new TipoInversion();
                tipoInv.setTipoTipoInversion(tipo);
                tipoInversionRepo.save(tipoInv);
            }
            System.out.println("Capitalizaciones cargadas en la BD.");
        }
    }
}


