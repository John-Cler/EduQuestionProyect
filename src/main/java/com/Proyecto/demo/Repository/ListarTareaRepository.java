package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.Lista_tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListarTareaRepository extends JpaRepository<Lista_tareas, Long> {
}
