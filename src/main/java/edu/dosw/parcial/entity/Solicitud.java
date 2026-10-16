package edu.dosw.parcial.entity;

public class Solicitud {

    private Long id;
    private String disponibilidadAsociada;
    private String correoSolicitante;
    private Estado estadoSolicitud; 


    private Solicitud() {

    }

    private Solicitud(Long id, String disponibilidadAsociada, String correoSolicitante, Estado estadoSolicitud){

        this.id = id; 
        this.disponibilidadAsociada = disponibilidadAsociada;
        this.correoSolicitante = correoSolicitante;
        this.estado = estado;
    }

    public Long getId(){
        return id;
    }

    public Long setId(Long Id){
        this.id = id
    }
}


    
