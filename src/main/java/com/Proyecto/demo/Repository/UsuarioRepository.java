package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query(value = "SELECT * FROM usuarios WHERE email = :correo", nativeQuery = true)
    Usuario buscarPorCorreo(String correo);

    @Query(value = "SELECT * FROM usuarios WHERE email = :correo", nativeQuery = true)
    boolean ExisteUsuarioCorreo(String correo);
}
