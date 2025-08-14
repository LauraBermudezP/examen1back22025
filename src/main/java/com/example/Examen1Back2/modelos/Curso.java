package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 100, nullable = false, unique = true, updatable = true)
    private String nombre;

    // RELACIONES

    @ManyToOne
    @JoinColumn(name = "fk_docente", referencedColumnName = "id");
    @JsonBackReference(value = "docente-curso")
    private Docente docente;

    // CONSTRUCTORES

    public Curso() {
    }

    public Curso(Docente docente, String nombre, Integer id) {
        this.docente = docente;
        this.nombre = nombre;
        this.id = id;
    }

    // GETTERS

    public Docente getDocente() {
        return docente;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    // SETTERS

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
