package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EntidadesInversiones")
@Getter @Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EntidadInversion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_entidad", nullable = false)
    private Entidad entidad;

    @ManyToOne
    @JoinColumn(name = "id_inversion", nullable = false)
    private Inversion inversion;
    
    private LocalDateTime fecha_inversion;
    
    private Double monto_invertido;

    
    public EntidadInversion() {
        
        this.fecha_inversion = LocalDateTime.now(); 
        
    }

    public EntidadInversion(Long id, Entidad entidad, Inversion inversion, LocalDateTime fecha_inversion, Double monto_invertido) {
        this.id = id;
        this.entidad = entidad;
        this.inversion = inversion;
        this.fecha_inversion = fecha_inversion;
        this.monto_invertido = monto_invertido;
    }
   
}