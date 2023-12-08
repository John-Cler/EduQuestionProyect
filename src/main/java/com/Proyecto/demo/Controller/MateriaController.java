package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Dto.MateriaDTO;
import com.Proyecto.demo.Services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")

public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public MateriaDTO crearMateria(@RequestBody MateriaDTO materiaDTO) {
        // Lógica para crear una nueva materia y devolver su representación TDO
        return materiaService.crearMateria(materiaDTO);
    }

    @GetMapping
    public List<MateriaDTO> listarMaterias() {
        // Lógica para listar todas las materias y devolver sus representaciones TDO
        return materiaService.listarMaterias();
    }

    @GetMapping("/{id}")
    public MateriaDTO obtenerMateria(@PathVariable Long id) {
        // Lógica para obtener una materia por su ID y devolver su representación TDO
        return materiaService.obtenerMateria(id);
    }

    @PutMapping("/{id}")
    public MateriaDTO actualizarMateria(@PathVariable Long id, @RequestBody MateriaDTO materiaDTO) {
        // Lógica para actualizar una materia y devolver su representación TDO
        return materiaService.actualizarMateria(id, materiaDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarMateria(@PathVariable Long id) {
        // Lógica para eliminar una materia por su ID
        materiaService.eliminarMateria(id);
    }
}