package edu.dosw.parcial.entity;

import edu.dosw.parcial.model.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private String correo;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotBlank
    @Column(length = 100)
    private String programa;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoModel estado;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RolModel rol;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private NivelModel nivel;

    @ManyToMany
    @Column(length = 100)
    private List<Materia> materiasInscritas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String correo, String nombre, String programa,
         EstadoModel estado, RolModel rol, NivelModel nivel) {
        
        this.correo = correo;
        this.nombre = nombre;
        this.programa = programa;
        this.estado = estado;
        this.rol = rol;
        this.nivel = nivel;
        
    }

    public String getCorreo() {
        return correo;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public String getPrograma() {
        return programa;
    }

    public String getNombre() {
        return nombre;
    }

    public RolModel getRol() {
        return rol;
    }

    public NivelModel getNivel() {
        return nivel;
    }

    public List<Materia> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public void setMateriasInscritas(List<Materia> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    public void setNivel(NivelModel nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setRol(RolModel rol) {
        this.rol = rol;
    }
}