package hn.lenguajes.examenreposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hn.lenguajes.examenreposicion.modelos.Equipos;


public interface EquiposRepositorio extends JpaRepository <Equipos, Integer> {
    @Query("SELECT e FROM Equipos e WHERE e.codigo_equipo = :codigoEquipo")
    Equipos findByCodigoEquipo(@Param("codigoEquipo") int codigoEquipo);
}
