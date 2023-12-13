package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Dto.MateriaDto;
import com.Proyecto.demo.Entity.Materia;
import com.Proyecto.demo.Services.MateriaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/materias")
public class ApiMateria {
    @Autowired
    MateriaService materiaService;
    @GetMapping("/materias_grado/{id}")
    public ResponseEntity<List<MateriaDto>> getMateriasPorUsuarioGrado(@PathVariable("id") int id) {
        List<Materia> materias = materiaService.buscarPorUsuarioGrado(id);
        List<MateriaDto> materiaDtos = new ArrayList<>();
        for(Materia item : materias){
            MateriaDto mdto = new MateriaDto();
            mdto.setId(item.getId());
            mdto.setNombre(item.getNombre());
            mdto.setNota(item.getNota()+ "");
            mdto.setEstado(item.getEstado());
            materiaDtos.add(mdto);
        }
        return ResponseEntity.ok(materiaDtos);
    }
}
