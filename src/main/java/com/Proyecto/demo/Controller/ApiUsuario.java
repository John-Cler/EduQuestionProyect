package com.Proyecto.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarjetas")

public class ApiUsuario {

    @Autowired
    private TarjetaService tarjetaService;

    @PostMapping
    public TarjetaDTO crearTarjeta(@RequestBody TarjetaDTO tarjetaDTO) {
        // Lógica para crear una nueva tarjeta y devolver su representación TDO
        return tarjetaService.crearTarjeta(tarjetaDTO);
    }

    @GetMapping
    public List<TarjetaDTO> listarTarjetas() {
        // Lógica para listar todas las tarjetas y devolver sus representaciones TDO
        return tarjetaService.listarTarjetas();
    }

    @GetMapping("/{id}")
    public TarjetaDTO obtenerTarjeta(@PathVariable Long id) {
        // Lógica para obtener una tarjeta por su ID y devolver su representación TDO
        return tarjetaService.obtenerTarjeta(id);
    }

    @PutMapping("/{id}")
    public TarjetaDTO actualizarTarjeta(@PathVariable Long id, @RequestBody TarjetaDTO tarjetaDTO) {
        // Lógica para actualizar una tarjeta y devolver su representación TDO
        return tarjetaService.actualizarTarjeta(id, tarjetaDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarjeta(@PathVariable Long id) {
        // Lógica para eliminar una tarjeta por su ID
        tarjetaService.eliminarTarjeta(id);
    }

}
