package com.codesa.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;

    @NotBlank
    private String nombre_curso;

    @NotBlank
    private String descripcion;

    @Min(1)
    private Integer creditos;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_persona")
    private Profesor profesor;
}
