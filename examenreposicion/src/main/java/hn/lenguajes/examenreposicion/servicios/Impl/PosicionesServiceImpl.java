package hn.lenguajes.examenreposicion.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.modelos.Posiciones;
import hn.lenguajes.examenreposicion.repositorios.PosicionesRepositorio;
import hn.lenguajes.examenreposicion.servicios.PosicionesService;

@Service
public class PosicionesServiceImpl implements PosicionesService {

    @Autowired
    public PosicionesRepositorio PR;

    @Override
    public List<Posiciones> obtenerTodos() {
        return this.PR.findAll();
    }

    @Override
    public Posiciones buscarPosicionesPorEquipo(Equipos equipo) {
        return PR.findByEquipos(equipo);
    }

    @Override
    public void guardarPosiciones(Posiciones posiciones) {
        PR.save(posiciones);
    }
    
}
