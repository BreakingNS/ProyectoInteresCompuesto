package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.DTO.CalculadoraDTO;
import com.breakingns.ProyectoInteresCompuesto.model.Calculadora;
import java.time.LocalDateTime;
import java.util.List;

public interface ICalculadoraService {
    
    public List<CalculadoraDTO> getCalculadora();
    public void saveCalculadora(Calculadora calc);
    public void deleteCalculadora(Long id);
    public CalculadoraDTO findCalculadora(Long id);
    public Calculadora editCalculadora(Long id_original,
                                        String nombre_calculoNuevo,
                                        LocalDateTime fecha_calculoNuevo,
                                        Double inversion_inicialNuevo,
                                        Double contribucion_mensualNuevo,
                                        Integer cantidad_aniosNuevo,
                                        Double tasa_interes_estimadaNuevo,
                                        Double varianza_tasa_interesNuevo);
    
}
