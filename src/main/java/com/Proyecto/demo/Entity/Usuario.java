package com.Proyecto.demo.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String email;
    private String nombre;
    @OneToMany(mappedBy = "usuario")
    private List<GradoUsuario> usuario_grados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<GradoUsuario> getUsuario_grados() {
        return usuario_grados;
    }

    public void setUsuario_grados(List<GradoUsuario> usuario_grados) {
        this.usuario_grados = usuario_grados;
    }
}
