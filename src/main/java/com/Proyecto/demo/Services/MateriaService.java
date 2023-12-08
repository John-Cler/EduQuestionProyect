package com.Proyecto.demo.Services;

import com.Proyecto.demo.Dto.MateriaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {
    // Lógica de negocio para las operaciones CRUD
    // Puedes utilizar un repositorio de Spring Data JPA para acceder a la base de datos

    public MateriaDTO crearMateria(MateriaDTO materiaDTO) {
        // Lógica para crear una nueva materia y devolver su representación TDO
        return null;
    }

    public List<MateriaDTO> listarMaterias() {
        // Lógica para listar todas las materias y devolver sus representaciones TDO
        // ...
        return null;
    }

    public MateriaDTO obtenerMateria(Long id) {
        // Lógica para obtener una materia por su ID y devolver su representación TDO
        // ...
        return null;
    }

    public MateriaDTO actualizarMateria(Long id, MateriaDTO materiaDTO) {
        // Lógica para actualizar una materia y devolver su representación TDO
        // ...
        return null;
    }

    public void eliminarMateria(Long id) {
        // Lógica para eliminar una materia por su ID
        // ...
    }
}
