package com.Proyecto.demo.Dto;

import java.util.List;

public class GradoDto {
    private  Long id;
    private Long usuario_id;
    private String grado;
    private String nivel;
    private List<MateriaDto> materias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<MateriaDto> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaDto> materias) {
        this.materias = materias;
    }
}
