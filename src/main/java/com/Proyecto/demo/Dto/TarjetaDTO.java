package com.Proyecto.demo.Dto;

public class TarjetaDTO {

    private Long Id;
    private String Numero;
    private String Estado;

    public TarjetaDTO() {
    }

    public TarjetaDTO(Long id, String numero, String estado) {
        Id = id;
        Numero = numero;
        Estado = estado;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
