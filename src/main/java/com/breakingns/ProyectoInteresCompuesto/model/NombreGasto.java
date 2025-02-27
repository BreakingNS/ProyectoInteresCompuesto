package com.breakingns.ProyectoInteresCompuesto.model;
/*
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "nombre_gastos")
public class NombreGasto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_nombre_gasto;
    
    private String nombreGasto;
    
    @OneToMany(mappedBy = "nombre_gasto")
    private List<Gasto> listaGastos;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
    
    public NombreGasto() {
    }

    public NombreGasto(Long id_nombre_gasto, String nombreGasto, List<Gasto> listaGastos, Usuario usuario) {
        this.id_nombre_gasto = id_nombre_gasto;
        this.nombreGasto = nombreGasto;
        this.listaGastos = listaGastos;
        this.usuario = usuario;
    }
}
*/