package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @Column(length = 4)
    private String neumonico;

    @NotBlank 
    @Column(nullable = false, length = 100)
    private String nombre;
    
    public Materia(){}

    public Materia(String neumonico, String nombre){
        this.neumonico = neumonico;
        this.nombre = nombre;
    }

    public String getNeumonico() {
        return neumonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNeumonico(String neumonico) {
        this.neumonico = neumonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
