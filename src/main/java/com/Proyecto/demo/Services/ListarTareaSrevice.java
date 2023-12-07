package com.Proyecto.demo.Services;

import com.Proyecto.demo.Dto.ListarTareasDTO;
import com.Proyecto.demo.Entity.Lista_tareas;
import com.Proyecto.demo.Repository.ListarTareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

import java.util.List;

@Service
public class ListarTareaSrevice {
    private final ListarTareaRepository listarTareaRepository;

    @Autowired
    public ListarTareaSrevice(ListarTareaRepository listarTareaRepository) {
        this.listarTareaRepository = listarTareaRepository;
    }
    public List<ListarTareasDTO> listarTareas() {
        List<Lista_tareas> tareas = listarTareaRepository.findAll();
        return tareas.stream()
                .map(this::convertirATareaDTO)
                .collect(Collectors.toList());
    }

    private ListarTareasDTO convertirATareaDTO(Lista_tareas listaTareas) {
        ListarTareasDTO tareaDTO = new ListarTareasDTO();
        tareaDTO.setDescripcion(listaTareas.getDescripcion());
        tareaDTO.setCompletada(listaTareas.getEstado());
        return tareaDTO;
    }
}
