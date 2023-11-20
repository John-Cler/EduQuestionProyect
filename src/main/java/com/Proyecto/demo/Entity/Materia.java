package com.Proyecto.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmateria;
    private String tipo_materia;
    private String descripcion;

    public Materia() {
    }

    public Materia(Integer idmateria, String tipo_materia, String descripcion) {
        this.idmateria = idmateria;
        this.tipo_materia = tipo_materia;
        this.descripcion = descripcion;
    }

    public Integer getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Integer idmateria) {
        this.idmateria = idmateria;
    }

    public String getTipo_materia() {
        return tipo_materia;
    }

    public void setTipo_materia(String tipo_materia) {
        this.tipo_materia = tipo_materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Materia{" +
                "idmateria=" + idmateria +
                ", tipo_materia='" + tipo_materia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
