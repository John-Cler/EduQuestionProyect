package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Dto.ItinerarioDto;
import com.Proyecto.demo.Dto.MateriaDto;
import com.Proyecto.demo.Entity.GradoUsuario;
import com.Proyecto.demo.Entity.Itinerario;
import com.Proyecto.demo.Entity.Materia;
import com.Proyecto.demo.Services.GradoService;
import com.Proyecto.demo.Services.ItinerarioService;
import com.Proyecto.demo.Services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/itinerarios")
public class ApiItinerario {
    @Autowired
    private ItinerarioService itinerarioService;
    @Autowired
    private MateriaService materiaService;
    @Autowired
    private GradoService gradoService;
    @GetMapping("/itinerarios_grado/{id}")
    public ResponseEntity<List<ItinerarioDto>> getGradosUsuario(@PathVariable("id") int id) {
        List<Itinerario> itinerarios = itinerarioService.buscarPorUsuarioGrado(id);
        List<ItinerarioDto> itinerarioDtos = new ArrayList<>();
        for(Itinerario iti: itinerarios){
            ItinerarioDto itinerarioDto = new ItinerarioDto();
            itinerarioDto.setId(Long.parseLong(iti.getId()+""));
            itinerarioDto.setRes_itinerario(iti.getRes_itinerario());
            itinerarioDto.setTema(iti.getTema());
            // obtener materia
            Materia materia = iti.getMateria();
            MateriaDto materiaDto = new MateriaDto();
            materiaDto.setId(materia.getId());
            materiaDto.setNombre(materia.getNombre());
            materiaDto.setNota(materia.getNota()+"");
            materiaDto.setEstado(materia.getEstado());
            //asignar materia
            itinerarioDto.setMateria(materiaDto);
            itinerarioDto.setUsuario_grado_id(Long.parseLong(materia.getUsuario_grado().getId()+""));
            itinerarioDtos.add(itinerarioDto);
        }
        return ResponseEntity.ok(itinerarioDtos);
    }

    @GetMapping("/itinerario_materia/{id}")
    public ResponseEntity<ItinerarioDto> getItinerario(@PathVariable("id") int id) {
        Itinerario itinerario = itinerarioService.buscarPorMateria(id);
        ItinerarioDto itinerarioDto = new ItinerarioDto();
        itinerarioDto.setId(Long.parseLong(itinerario.getId()+""));
        itinerarioDto.setRes_itinerario(itinerario.getRes_itinerario());
        itinerarioDto.setTema(itinerario.getTema());
        // obtener materia
        Materia materia = itinerario.getMateria();
        MateriaDto materiaDto = new MateriaDto();
        materiaDto.setId(materia.getId());
        materiaDto.setNombre(materia.getNombre());
        materiaDto.setNota(materia.getNota()+"");
        materiaDto.setEstado(materia.getEstado());
        //asignar materia
        itinerarioDto.setMateria(materiaDto);
        itinerarioDto.setUsuario_grado_id(Long.parseLong(materia.getUsuario_grado().getId()+""));

        return ResponseEntity.ok(itinerarioDto);
    }
    @GetMapping("{id}")
    public ResponseEntity<ItinerarioDto> getItinerarioById(@PathVariable("id") Long id) {
        Itinerario itinerario = itinerarioService.getById(id);
        ItinerarioDto itinerarioDto = new ItinerarioDto();
        itinerarioDto.setId(Long.parseLong(itinerario.getId()+""));
        itinerarioDto.setRes_itinerario(itinerario.getRes_itinerario());
        itinerarioDto.setTema(itinerario.getTema());
        // obtener materia
        Materia materia = itinerario.getMateria();
        MateriaDto materiaDto = new MateriaDto();
        materiaDto.setId(materia.getId());
        materiaDto.setNombre(materia.getNombre());
        materiaDto.setNota(materia.getNota()+"");
        materiaDto.setEstado(materia.getEstado());
        //asignar materia
        itinerarioDto.setMateria(materiaDto);
        itinerarioDto.setUsuario_grado_id(Long.parseLong(materia.getUsuario_grado().getId()+""));

        return ResponseEntity.ok(itinerarioDto);
    }

    @PostMapping
    public ResponseEntity<String> saveItinerario(@RequestBody ItinerarioDto datos) {
        try {
            Materia materia = materiaService.getById(datos.getMateria_id());
            GradoUsuario gradoUsuario = gradoService.getById(Long.parseLong(materia.getUsuario_grado().getId()+""));
            Itinerario itinerario=new Itinerario();
            itinerario.setMateria(materia);
            itinerario.setUsuario_grado(gradoUsuario);
            itinerario.setTema(datos.getTema());
            itinerario.setRes_itinerario(datos.getRes_itinerario());
            Itinerario itinerario_creado = itinerarioService.save(itinerario);
            return ResponseEntity.ok("Registro éxitoso " + itinerario_creado.getId());
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}
