package com.Proyecto.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Itinerario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "materia_id")
    @JsonIgnore
    private Materia materia;
    @ManyToOne
    @JoinColumn(name = "usuario_grado_id")
    @JsonIgnore
    private GradoUsuario usuario_grado;
    private String tema;
    @Column(columnDefinition = "text")
    private String res_itinerario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public GradoUsuario getUsuario_grado() {
        return usuario_grado;
    }

    public void setUsuario_grado(GradoUsuario usuario_grado) {
        this.usuario_grado = usuario_grado;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getRes_itinerario() {
        return res_itinerario;
    }

    public void setRes_itinerario(String res_itinerario) {
        this.res_itinerario = res_itinerario;
    }
}

