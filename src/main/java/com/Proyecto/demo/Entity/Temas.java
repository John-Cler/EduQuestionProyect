//package com.Proyecto.demo.Entity;
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "temas")
//public class Temas {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer idtema;
//    private String nombre_tema;
//    private String descripcion;
//
//    public Temas() {
//    }
//
//    public Temas(Integer idtema, String nombre_tema, String descripcion) {
//        this.idtema = idtema;
//        this.nombre_tema = nombre_tema;
//        this.descripcion = descripcion;
//    }
//
//    public Integer getIdtema() {
//        return idtema;
//    }
//
//    public void setIdtema(Integer idtema) {
//        this.idtema = idtema;
//    }
//
//    public String getNombre_tema() {
//        return nombre_tema;
//    }
//
//    public void setNombre_tema(String nombre_tema) {
//        this.nombre_tema = nombre_tema;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    @Override
//    public String toString() {
//        return "Temas{" +
//                "idtema=" + idtema +
//                ", nombre_tema='" + nombre_tema + '\'' +
//                ", descripcion='" + descripcion + '\'' +
//                '}';
//    }
//}
