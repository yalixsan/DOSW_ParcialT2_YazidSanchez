package edu.dosw.parcial.entity;

public class Tutor implements Usuario {

    @Id 
    private String correo; 

    private String nombre;
    private String programa;
    private Estado estado;
    private Rol rol; 
    private Nivel nivel;


    public Tutor() {}

    public Tutor(String correo, String nombre, String programa, Estado estado, Rol rol, Nivel nivel){

        this.correo = correo;
        this.nombre = nombre; 
        this.programa = programa;
        this.estado = estado; 
        this.rol = rol; 
        this.nivel = nivel; 
    }

    public string getCorreo() {
        return correo;
    }

    public String setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public Estado setEstado(Estado estado) {
        this.estado = estado;
    }

    public Rol serRol() {
        return rol;
    }

    public Rol setRol(Rol rol) {
        this.rol = rol;
    }

    public Nivel getNivel(){
        return nivel;
    }

    public Nivel setNivel(Nivel nivel){
        this.nivel = nivel;
    }

}

    
