package edu.dosw.parcial.entity;

import edu.dosw.parcial.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "disponibilidades")
public class Disponibilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalDateTime hora_inicio;

    @Column(nullable = false)
    private LocalDateTime hora_final;

    @NotBlank
    @Column(length = 100)
    private String lugar;

    @Enumerated (EnumType.STRING)
    private TipoModalidad modalidad;

    @Enumerated(EnumType.STRING)
    private TipoEstado estado;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Tutor tutor;




}
