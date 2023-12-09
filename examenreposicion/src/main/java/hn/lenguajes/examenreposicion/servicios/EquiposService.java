package hn.lenguajes.examenreposicion.servicios;

import java.util.List;

import hn.lenguajes.examenreposicion.modelos.Equipos;

public interface EquiposService {
    public Equipos crearEquipo (Equipos equipo);
    public Equipos buscarEquipoPorCodigo(int codigoEquipo);
    public void eliminarEquipo(int codigo_equipo);

    public Equipos crearEquipo(String nombre);
    public List<Equipos> obtenerTodos();
}
