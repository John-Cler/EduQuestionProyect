package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
    @Query(value = "SELECT * FROM materias WHERE usuario_grado_id = :usuario_grado_id", nativeQuery = true)
    List<Materia> buscarPorUsuarioGrado(int usuario_grado_id);
}
