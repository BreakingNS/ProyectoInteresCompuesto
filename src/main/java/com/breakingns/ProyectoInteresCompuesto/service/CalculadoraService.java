package com.breakingns.ProyectoInteresCompuesto.service;

import com.breakingns.ProyectoInteresCompuesto.DTO.CalculadoraDTO;
import com.breakingns.ProyectoInteresCompuesto.model.Calculadora;
import com.breakingns.ProyectoInteresCompuesto.repository.ICalculadoraRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService{

    @Autowired
    public ICalculadoraRepository repo;
    
    @Override
    public List<CalculadoraDTO> getCalculadora() {
        List<Calculadora> listaCalculadoras = repo.findAll();
        List<CalculadoraDTO> listaCalculadorasDTO= new ArrayList<>();
        
        /*
        Double subVarianzaSuperior = 0.0;
        Double subValorFuturo = 0.0;
        Double subVarianzaInferior = 0.0;
        Double contribucion = 0.0;
        */
        
        for(Calculadora calc: listaCalculadoras){
            CalculadoraDTO calcDTO = new CalculadoraDTO();
            calcDTO.setId_calculo(calc.getId_calculo());
            calcDTO.setNombre_calculo(calc.getNombre_calculo());
            calcDTO.setFecha_calculo(calc.getFecha_calculo().toLocalDate());
            calcDTO.setInversion_inicial(calc.getInversion_inicial());
            calcDTO.setContribucion_mensual(calc.getContribucion_mensual());
            calcDTO.setCantidad_anios(calc.getCantidad_anios());
            calcDTO.setTasa_interes_estimada(calc.getTasa_interes_estimada());
            calcDTO.setVarianza_tasa_interes(calc.getVarianza_tasa_interes());
            calcDTO.setNombre_usuario(calc.getUsuario().getNombre_usuario());
            calcDTO.setCapitalizacion(calc.getCapitalizacion());
            
            calcDTO.setVarianzaSuperior(calc.getTasa_interes_estimada() + calc.getVarianza_tasa_interes());
            calcDTO.setValorFuturo(calc.getTasa_interes_estimada());
            calcDTO.setVarianzaInferior(calc.getTasa_interes_estimada() - calc.getVarianza_tasa_interes());
            
            calcDTO.setListaVarianzaSuperior(this.calculoListaVarianzaSuperior(calcDTO));
            calcDTO.setListaValorFuturo(this.calculoListaValorFuturo(calcDTO));
            calcDTO.setListaVarianzaInferior(this.calculoListaVarianzaInferior(calcDTO));
            
            calcDTO.setListaContribucionTotal(this.calculoListaContribucion(calcDTO));
            
            listaCalculadorasDTO.add(calcDTO);
        }
        
        return listaCalculadorasDTO;
    }

    @Override
    public void saveCalculadora(Calculadora calc) {
        repo.save(calc);
    }

    @Override
    public void deleteCalculadora(Long id) {
        repo.deleteById(id);
    }
    /*
    @Override
    public CalculadoraDTO findCalculadora(Long id) {
        return repo.findById(id).orElse(null);
    }
    */
    @Override
    public Calculadora editCalculadora(Long id_original, String nombre_calculoNuevo, LocalDateTime fecha_calculoNuevo, Double inversion_inicialNuevo, Double contribucion_mensualNuevo, Integer cantidad_aniosNuevo, Double tasa_interes_estimadaNuevo, Double varianza_tasa_interesNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public CalculadoraDTO findCalculadora(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Double> calculoListaContribucion(CalculadoraDTO calcDTO){
        List<Double> listaContribucion = new ArrayList<>();
        Double aux = calcDTO.getInversion_inicial();
        
        for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
            listaContribucion.add(aux);
            aux = aux + (calcDTO.getContribucion_mensual() * 12);
        }
        
        return listaContribucion;
    }
    
    public List<Double> calculoListaValorFuturo(CalculadoraDTO calcDTO){
        List<Double> listaValorFuturo = new ArrayList<>();
        Double aux = calcDTO.getInversion_inicial();
        
        if(calcDTO.getCapitalizacion().getId_capitalizacion() == 1){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaValorFuturo.add(aux);
                aux = (aux * (calcDTO.getTasa_interes_estimada() / 100)) + (calcDTO.getContribucion_mensual() * 12) + aux;
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 2){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaValorFuturo.add(aux);
                for(int x = 0; x < 2; x++){
                    aux = (aux * (calcDTO.getTasa_interes_estimada() / 200)) + (calcDTO.getContribucion_mensual() * 6) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 3){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaValorFuturo.add(aux);
                for(int x = 0; x < 4; x++){
                    aux = (aux * (calcDTO.getTasa_interes_estimada() / 400)) + (calcDTO.getContribucion_mensual() * 3) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 4){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaValorFuturo.add(aux);
                for(int x = 0; x < 12; x++){
                    aux = (aux * (calcDTO.getTasa_interes_estimada() / 1200)) + calcDTO.getContribucion_mensual() + aux;
                }   
            }
        }else{
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaValorFuturo.add(aux);
                for(int x = 0; x < 365; x++){
                    aux = (aux * (calcDTO.getTasa_interes_estimada() / 36500)) + (calcDTO.getContribucion_mensual()/30) + aux;
                }   
            }
        }
        
        return listaValorFuturo;
    }
    
    public List<Double> calculoListaVarianzaSuperior(CalculadoraDTO calcDTO){
        
        List<Double> listaVarianzaSuperior = new ArrayList<>();
        Double aux = calcDTO.getInversion_inicial();
        /*
        for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
            listaVarianzaSuperior.add(aux);
            aux = (aux * (calcDTO.getVarianzaSuperior()/ 100)) + (calcDTO.getContribucion_mensual() * 12) + aux;
        }
        */
        if(calcDTO.getCapitalizacion().getId_capitalizacion() == 1){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaVarianzaSuperior.add(aux);
                aux = (aux * (calcDTO.getVarianzaSuperior() / 100)) + (calcDTO.getContribucion_mensual() * 12) + aux;
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 2){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaVarianzaSuperior.add(aux);
                for(int x = 0; x < 2; x++){
                    aux = (aux * (calcDTO.getVarianzaSuperior() / 200)) + (calcDTO.getContribucion_mensual() * 6) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 3){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaVarianzaSuperior.add(aux);
                for(int x = 0; x < 4; x++){
                    aux = (aux * (calcDTO.getVarianzaSuperior() / 400)) + (calcDTO.getContribucion_mensual() * 3) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 4){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaVarianzaSuperior.add(aux);
                for(int x = 0; x < 12; x++){
                    aux = (aux * (calcDTO.getVarianzaSuperior() / 1200)) + calcDTO.getContribucion_mensual() + aux;
                }   
            }
        }else{
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                listaVarianzaSuperior.add(aux);
                for(int x = 0; x < 365; x++){
                    aux = (aux * (calcDTO.getVarianzaSuperior() / 36500)) + (calcDTO.getContribucion_mensual()/30) + aux;
                }   
            }
        }
        
        return listaVarianzaSuperior;
    }
    
    public List<Double> calculoListaVarianzaInferior(CalculadoraDTO calcDTO){
        
        List<Double> ListaVarianzaInferior = new ArrayList<>();
        Double aux = calcDTO.getInversion_inicial();
        /*
        for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
            ListaVarianzaInferior.add(aux);
            aux = (aux * (calcDTO.getVarianzaInferior()/ 100)) + (calcDTO.getContribucion_mensual() * 12) + aux;
        }
        */
        if(calcDTO.getCapitalizacion().getId_capitalizacion() == 1){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                ListaVarianzaInferior.add(aux);
                aux = (aux * (calcDTO.getVarianzaInferior() / 100)) + (calcDTO.getContribucion_mensual() * 12) + aux;
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 2){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                ListaVarianzaInferior.add(aux);
                for(int x = 0; x < 2; x++){
                    aux = (aux * (calcDTO.getVarianzaInferior() / 200)) + (calcDTO.getContribucion_mensual() * 6) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 3){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                ListaVarianzaInferior.add(aux);
                for(int x = 0; x < 4; x++){
                    aux = (aux * (calcDTO.getVarianzaInferior() / 400)) + (calcDTO.getContribucion_mensual() * 3) + aux;
                }   
            }
        }else if(calcDTO.getCapitalizacion().getId_capitalizacion() == 4){
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                ListaVarianzaInferior.add(aux);
                for(int x = 0; x < 12; x++){
                    aux = (aux * (calcDTO.getVarianzaInferior() / 1200)) + calcDTO.getContribucion_mensual() + aux;
                }   
            }
        }else{
            for(int i = 0; i <= calcDTO.getCantidad_anios(); i++){
                ListaVarianzaInferior.add(aux);
                for(int x = 0; x < 365; x++){
                    aux = (aux * (calcDTO.getVarianzaInferior() / 36500)) + (calcDTO.getContribucion_mensual()/30) + aux;
                }   
            }
        }
        
        return ListaVarianzaInferior;
    }

    
    
}
