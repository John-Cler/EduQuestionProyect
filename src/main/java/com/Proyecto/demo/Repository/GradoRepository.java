package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.GradoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GradoRepository extends JpaRepository<GradoUsuario, Long> {
    @Query(value = "SELECT * FROM usuario_grados WHERE usuario_id = :usuario_id", nativeQuery = true)
    List<GradoUsuario> buscarPorUsuario(int usuario_id);
}
