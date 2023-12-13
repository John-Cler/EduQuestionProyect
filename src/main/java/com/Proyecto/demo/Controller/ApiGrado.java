package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Dto.GradoDto;
import com.Proyecto.demo.Dto.MateriaDto;
import com.Proyecto.demo.Entity.GradoUsuario;
import com.Proyecto.demo.Entity.Materia;
import com.Proyecto.demo.Entity.Usuario;
import com.Proyecto.demo.Services.GradoService;
import com.Proyecto.demo.Services.MateriaService;
import com.Proyecto.demo.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/grados")
public class ApiGrado {
    @Autowired
    private GradoService grado_service;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private MateriaService materiaService;
    @GetMapping
    public ResponseEntity<List<GradoUsuario>> getGrados() {
        return ResponseEntity.ok(grado_service.findAll());
    }
    @GetMapping("/grados_usuario/{id}")
    public ResponseEntity<List<GradoUsuario>> getGradosUsuario(@PathVariable("id") int id) {
        return ResponseEntity.ok(grado_service.buscarPorUsuario(id));
    }
    @GetMapping("{id}")
    public ResponseEntity<GradoDto> getGrado(@PathVariable("id") Long id) {
        GradoUsuario grado = grado_service.getById(id);
        GradoDto gradoDto = new GradoDto();
        gradoDto.setId(Long.parseLong(grado.getId()+""));
        gradoDto.setUsuario_id(Long.parseLong(grado.getUsuario().getId()+""));
        gradoDto.setGrado(grado.getGrado());
        gradoDto.setNivel(grado.getNivel());
        //return ResponseEntity.ok("Registro éxitoso " + grado.getId());
        return ResponseEntity.ok(gradoDto);
    }

    @PostMapping
    public ResponseEntity<GradoDto> saveGrado(@RequestBody GradoDto datos) {
        try {
            Usuario usuario = usuarioService.getById(datos.getUsuario_id());
            GradoUsuario nuevo_grado = new GradoUsuario();
            nuevo_grado.setUsuario(usuario);
            nuevo_grado.setGrado(datos.getGrado());
            nuevo_grado.setNivel(datos.getNivel());
            List<MateriaDto> materias_dto = datos.getMaterias();
            GradoUsuario grado_creado = grado_service.save(nuevo_grado);
            for (MateriaDto mdto : materias_dto) {
                String nombre = mdto.getNombre();
                String nota = mdto.getNota();
                String estado = mdto.getEstado();
                // Crear un objeto Materia y agregarlo a la lista
                Materia materia = new Materia();
                materia.setNombre(nombre);
                materia.setNota(Float.parseFloat(nota));
                materia.setEstado(estado);
                materia.setUsuario_grado(grado_creado);
                materiaService.save(materia);
            }

            GradoDto gradoDto = new GradoDto();
            gradoDto.setId(Long.parseLong(grado_creado.getId()+""));
            gradoDto.setUsuario_id(Long.parseLong(grado_creado.getUsuario().getId()+""));
            gradoDto.setGrado(grado_creado.getGrado());
            gradoDto.setNivel(grado_creado.getNivel());
            return ResponseEntity.ok(gradoDto);
        } catch (Exception e) {
            System.out.println("================ERROR GRADOS===================");
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}
