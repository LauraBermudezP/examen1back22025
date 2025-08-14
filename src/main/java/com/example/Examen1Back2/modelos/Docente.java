package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "docente")
public class Docente {

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especialidad", length = 100, nullable = false, unique = true, updatable = true)
    private String especialidad;

    // RELACIONES

    @OneToMany(mappedBy = "docente")
    @JsonManagedReference(value = "docente-curso")
    private List<Curso> cursos;

    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonManagedReference(value = "docente-usuario")
    private Usuario usuario;

    // CONSTRUCTORES

    public Docente() {}

    public Docente(List<Curso> cursos, String especialidad, Integer id, Usuario usuario) {
        this.cursos = cursos;
        this.especialidad = especialidad;
        this.id = id;
        this.usuario = usuario;
    }

    // GETTERS

    public List<Curso> getCursos() {
        return cursos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Integer getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // SETTERS

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}