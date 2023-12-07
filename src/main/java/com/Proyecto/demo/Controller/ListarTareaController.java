package com.Proyecto.demo.Controller;

import com.Proyecto.demo.Dto.ListarTareasDTO;
import com.Proyecto.demo.Services.ListarTareaSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class ListarTareaController {
    private final ListarTareaSrevice listarTareaSrevice;

    @Autowired
    public ListarTareaController(ListarTareaSrevice listarTareaSrevice) {
        this.listarTareaSrevice = listarTareaSrevice;
    }

    @GetMapping
    public List<ListarTareasDTO> listarTareas() {
        return listarTareaSrevice.listarTareas();
    }
}
