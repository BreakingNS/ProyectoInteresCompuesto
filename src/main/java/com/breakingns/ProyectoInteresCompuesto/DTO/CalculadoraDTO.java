package com.breakingns.ProyectoInteresCompuesto.DTO;

import com.breakingns.ProyectoInteresCompuesto.model.Capitalizacion;
import com.breakingns.ProyectoInteresCompuesto.model.Usuario;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CalculadoraDTO {

    private Long id_calculo;    
    private String nombre_calculo;
    private LocalDate fecha_calculo;
    private Double inversion_inicial;
    private Double contribucion_mensual;
    private Integer cantidad_anios;
    private Double tasa_interes_estimada;
    private Double varianza_tasa_interes;
    
    private String nombre_usuario;
    private Capitalizacion capitalizacion;;
    
    private Double varianzaSuperior;
    private Double valorFuturo;
    private Double varianzaInferior;
    
    private List<Double> listaVarianzaSuperior;
    private List<Double> listaValorFuturo;
    private List<Double> listaVarianzaInferior;
    
    private List<Double> listaContribucionTotal;

    public CalculadoraDTO() {
    }

    public CalculadoraDTO(Long id_calculo, String nombre_calculo, LocalDate fecha_calculo, Double inversion_inicial, Double contribucion_mensual, Integer cantidad_anios, Double tasa_interes_estimada, Double varianza_tasa_interes, String nombre_usuario, Capitalizacion capitalizacion, Double varianzaSuperior, Double valorFuturo, Double varianzaInferior, List<Double> listaVarianzaSuperior, List<Double> listaValorFuturo, List<Double> listaVarianzaInferior, List<Double> listaContribucionTotal) {
        this.id_calculo = id_calculo;
        this.nombre_calculo = nombre_calculo;
        this.fecha_calculo = fecha_calculo;
        this.inversion_inicial = inversion_inicial;
        this.contribucion_mensual = contribucion_mensual;
        this.cantidad_anios = cantidad_anios;
        this.tasa_interes_estimada = tasa_interes_estimada;
        this.varianza_tasa_interes = varianza_tasa_interes;
        this.nombre_usuario = nombre_usuario;
        this.capitalizacion = capitalizacion;
        this.varianzaSuperior = varianzaSuperior;
        this.valorFuturo = valorFuturo;
        this.varianzaInferior = varianzaInferior;
        this.listaVarianzaSuperior = listaVarianzaSuperior;
        this.listaValorFuturo = listaValorFuturo;
        this.listaVarianzaInferior = listaVarianzaInferior;
        this.listaContribucionTotal = listaContribucionTotal;
    }
    
}
