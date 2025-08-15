package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 100, nullable = false, unique = true, updatable = true)
    private String nombre;

    @Column(name = "correo_electronico", length = 100, nullable = false, unique = true, updatable = true)
    private String correo_electronico;

    @Column(name = "contrasena", length = 10, nullable = false, unique = true, updatable = true)
    private String contrasena;

    @Column(name = "telefono", length = 10, nullable = true, unique = true, updatable = true)
    private String telefono;

    @Column(name = "tipo_usuario", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo_usuario;

    // RELACIONES

    @OneToOne(mappedBy = "usuario")
    @JsonBackReference(value = "docente-usuario")
    private Docente docente;

    // CONSTRUCTORES

    public Usuario() {
    }

    public Usuario(String contrasena, Docente docente, String correo_electronico, TipoUsuario tipo_usuario, String telefono, String nombre, Integer id) {
        this.contrasena = contrasena;
        this.docente = docente;
        this.correo_electronico = correo_electronico;
        this.tipo_usuario = tipo_usuario;
        this.telefono = telefono;
        this.nombre = nombre;
        this.id = id;
    }

    // GETTERS

    public String getContrasena() {
        return contrasena;
    }

    public TipoUsuario getTipo_usuario() {
        return tipo_usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    public Docente getDocente() {
        return docente;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    // SETTERS

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipo_usuario(TipoUsuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
}