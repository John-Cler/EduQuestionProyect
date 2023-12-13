package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Entity.Usuario;
import com.Proyecto.demo.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/usuarios")

public class ApiUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("id") Long id) {
        return ResponseEntity.ok(usuarioService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario nuevo_usuario = new Usuario();
            //existe usuario
            boolean existe_usuario = usuarioService.ExisteUsuarioCorreo(usuario.getEmail());
            if(existe_usuario){
                nuevo_usuario = usuarioService.buscarPorCorreo(usuario.getEmail());
                return ResponseEntity.created(new URI("/api/v1/usuarios/" + nuevo_usuario.getId())).body(nuevo_usuario);
            }else{
                nuevo_usuario.setNombre(usuario.getNombre());
                nuevo_usuario.setEmail(usuario.getEmail());
                Usuario usuario_creado = usuarioService.save(nuevo_usuario);
                return ResponseEntity.created(new URI("/api/v1/usuarios/" + usuario_creado.getId())).body(usuario_creado);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
