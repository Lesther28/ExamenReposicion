package hn.lenguajes.examenreposicion.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.modelos.Posiciones;
import hn.lenguajes.examenreposicion.repositorios.EquiposRepositorio;
import hn.lenguajes.examenreposicion.repositorios.PosicionesRepositorio;
import hn.lenguajes.examenreposicion.servicios.EquiposService;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposRepositorio equiposRepositorio;

@Autowired
    private PosicionesRepositorio posicionesRepositorio;

    @Override
    public Equipos crearEquipo(Equipos equipo) {
        Equipos equipoCreado= this.equiposRepositorio.save(equipo);
        return equipoCreado;
    }
    
    
    @Override
    public Equipos buscarEquipoPorCodigo(int codigoEquipo) {
        return equiposRepositorio.findByCodigoEquipo(codigoEquipo);
    }

    @Override
    public void eliminarEquipo(int codigoEquipo) {
        Equipos equipo = equiposRepositorio.findByCodigoEquipo(codigoEquipo);

        if (equipo != null) {
            Posiciones posiciones = equipo.getPosiciones();
            if (posiciones != null) {
                equipo.setPosiciones(null);
                posiciones.setEquipos(null);
                posicionesRepositorio.delete(posiciones);
            }

            equiposRepositorio.delete(equipo);
        } else {
            throw new IllegalStateException("No se puede eliminar el equipo si hay registros en la tabla de posiciones.");
        }
    }


    @Override
    public Equipos crearEquipo(String nombre) {
        Equipos nuevoEquipo = new Equipos();
        nuevoEquipo.setNombre(nombre);
        equiposRepositorio.save(nuevoEquipo);
        return nuevoEquipo;
    }


    @Override
    public List<Equipos> obtenerTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodos'");
    }
    
}
