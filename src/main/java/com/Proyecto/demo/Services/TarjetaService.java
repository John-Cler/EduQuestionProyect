package com.Proyecto.demo.Services;


import com.Proyecto.demo.Dto.TarjetaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaService {
    // Lógica de negocio para las operaciones CRUD
    // Puedes utilizar un repositorio de Spring Data JPA para acceder a la base de datos

    public TarjetaDTO crearTarjeta(TarjetaDTO tarjetaDTO) {
        // Lógica para crear una nueva tarjeta y devolver su representación TDO
        return null;
    }

    public List<TarjetaDTO> listarTarjetas() {
        // Lógica para listar todas las tarjetas y devolver sus representaciones TDO
        // ...
        return  null;
    }

    public TarjetaDTO obtenerTarjeta(Long id) {
        // Lógica para obtener una tarjeta por su ID y devolver su representación TDO
        return  null;
    }

    public TarjetaDTO actualizarTarjeta(Long id, TarjetaDTO tarjetaDTO) {
        // Lógica para actualizar una tarjeta y devolver su representación TDO
        return  null;
    }

    public void eliminarTarjeta(Long id) {
        // Lógica para eliminar una tarjeta por su ID

    }
}
