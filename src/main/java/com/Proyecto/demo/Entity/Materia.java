package com.Proyecto.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "usuario_grado_id")
    @JsonIgnore
    private GradoUsuario usuario_grado;
    private String nombre;
    private Float nota;
    private String estado;
    @OneToMany(mappedBy = "materia")
    private List<Itinerario> itinerarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GradoUsuario getUsuario_grado() {
        return usuario_grado;
    }

    public void setUsuario_grado(GradoUsuario usuario_grado) {
        this.usuario_grado = usuario_grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Itinerario> getItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }
}
