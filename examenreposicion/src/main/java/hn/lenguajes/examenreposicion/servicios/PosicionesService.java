package hn.lenguajes.examenreposicion.servicios;

import java.util.List;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.modelos.Posiciones;

public interface PosicionesService {
    public List<Posiciones> obtenerTodos();

    public Posiciones buscarPosicionesPorEquipo(Equipos equipo);
    public void guardarPosiciones(Posiciones posiciones);
}
