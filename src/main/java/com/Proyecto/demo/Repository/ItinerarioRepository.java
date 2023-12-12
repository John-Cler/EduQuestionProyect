package com.Proyecto.demo.Repository;

import com.Proyecto.demo.Entity.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario,Long> {

}
