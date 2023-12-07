package com.Proyecto.demo.Services;

import com.Proyecto.demo.Dto.ItinerarioDTO;
import com.Proyecto.demo.Entity.Intinerario;
import com.Proyecto.demo.Repository.ItinerarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItinerarioService {
    private final ItinerarioRepository itinerarioRepository;

    @Autowired
    public ItinerarioService(ItinerarioRepository itinerarioRepository) {
        this.itinerarioRepository = itinerarioRepository;
    }

    public ItinerarioDTO generarItinerario(ItinerarioDTO itinerarioDTO) {
        // Aquí puedes implementar la lógica para generar el itinerario, por ejemplo, llamando a OpenAI
        // Puedes usar un mapeador (Mapper) para convertir entre Itinerario y ItinerarioDTO
        // Guardar en la base de datos, etc.

        // Ejemplo de conversión (puedes usar una biblioteca como ModelMapper)
        Intinerario itinerario = new Intinerario();
        itinerario.setTopic(itinerarioDTO.getTopic());
        itinerario.setPlan(generarPlan(itinerarioDTO.getTopic())); // Método ficticio para generar el plan

        itinerarioRepository.save(itinerario);

        return convertirAItinerarioDTO(itinerario);
    }

    private ItinerarioDTO convertirAItinerarioDTO(Intinerario itinerario) {
        ItinerarioDTO itinerarioDTO = new ItinerarioDTO();
        itinerarioDTO.setTopic(itinerario.getTopic());
        itinerarioDTO.setPlan(itinerario.getPlan());
        return itinerarioDTO;
    }

    private String generarPlan(String topic) {
        // Lógica para generar el plan de estudio basado en el tema (puede ser tu lógica específica)
        // Aquí podrías llamar a OpenAI o cualquier otra fuente de datos
        return "Plan de estudio para " + topic;
    }
}
