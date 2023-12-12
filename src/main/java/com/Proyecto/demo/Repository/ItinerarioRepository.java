package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario,Long> {
    @Query(value = "SELECT * FROM itinerario_materia WHERE materia_id = :id", nativeQuery = true)
    boolean existeItinerarioMateria(int id);
    @Query(value = "SELECT * FROM itinerario_materia WHERE materia_id = :materia_id", nativeQuery = true)
    Itinerario buscarPorMateria(int materia_id);

    @Query(value = "SELECT * FROM itinerario_materia WHERE usuario_grado_id = :usuario_grado_id", nativeQuery = true)
    List<Itinerario> buscarPorUsuarioGrado(int usuario_grado_id);
}
