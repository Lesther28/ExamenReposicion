package hn.lenguajes.examenreposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.modelos.Posiciones;


public interface PosicionesRepositorio extends JpaRepository<Posiciones,Integer> {

    Posiciones findByEquipos(Equipos equipo);
}
