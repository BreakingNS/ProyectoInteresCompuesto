package com.breakingns.ProyectoInteresCompuesto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EntidadInversion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_entidad_inversion;
    private Double monto_invertido;
    private Date fecha_inversion;
    
    @ManyToOne
    private Entidad entidad;
    @ManyToOne
    private Inversion inversion;
    
    public EntidadInversion() {
    }

    public EntidadInversion(Long id_entidad_inversion, Double monto_invertido, Date fecha_inversion, Entidad entidad, Inversion inversion) {
        this.id_entidad_inversion = id_entidad_inversion;
        this.monto_invertido = monto_invertido;
        this.fecha_inversion = fecha_inversion;
        this.entidad = entidad;
        this.inversion = inversion;
    }

    

}
