package com.Proyecto.demo.Dto;

public class ItinerarioDto {
    private Long id;
    private Long materia_id;
    private MateriaDto materia;
    private Long usuario_grado_id;
    private String res_itinerario;
    private String tema;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(Long materia_id) {
        this.materia_id = materia_id;
    }

    public MateriaDto getMateria() {
        return materia;
    }

    public void setMateria(MateriaDto materia) {
        this.materia = materia;
    }

    public Long getUsuario_grado_id() {
        return usuario_grado_id;
    }

    public void setUsuario_grado_id(Long usuario_grado_id) {
        this.usuario_grado_id = usuario_grado_id;
    }

    public String getRes_itinerario() {
        return res_itinerario;
    }

    public void setRes_itinerario(String res_itinerario) {
        this.res_itinerario = res_itinerario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
