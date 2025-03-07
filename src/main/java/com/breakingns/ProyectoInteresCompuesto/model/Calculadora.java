package com.breakingns.ProyectoInteresCompuesto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "calculos")
@Getter @Setter
public class Calculadora {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_calculo;
    
    private String nombre_calculo;
    private LocalDateTime fecha_calculo;
    private Double inversion_inicial;
    private Double contribucion_mensual;
    private Integer cantidad_anios;
    private Double tasa_interes_estimada;
    private Double varianza_tasa_interes;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_capitalizacion")
    private Capitalizacion capitalizacion;
    
    /* COPIA
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_capitalizacion")
    private Capitalizacion capitalizacion;
    
    */
    

    public Calculadora() {
        
        this.fecha_calculo = LocalDateTime.now();
        
    }

    public Calculadora(Long id_calculo, String nombre_calculo, LocalDateTime fecha_calculo, Double inversion_inicial, Double contribucion_mensual, Integer cantidad_anios, Double tasa_interes_estimada, Double varianza_tasa_interes, Usuario usuario, Capitalizacion capitalizacion) {
        this.id_calculo = id_calculo;
        this.nombre_calculo = nombre_calculo;
        this.fecha_calculo = fecha_calculo;
        this.inversion_inicial = inversion_inicial;
        this.contribucion_mensual = contribucion_mensual;
        this.cantidad_anios = cantidad_anios;
        this.tasa_interes_estimada = tasa_interes_estimada;
        this.varianza_tasa_interes = varianza_tasa_interes;
        this.usuario = usuario;
        this.capitalizacion = capitalizacion;
    }

}
