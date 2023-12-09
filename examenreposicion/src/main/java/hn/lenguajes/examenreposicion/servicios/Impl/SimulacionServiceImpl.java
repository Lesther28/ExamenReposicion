package hn.lenguajes.examenreposicion.servicios.Impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.servicios.EquiposService;
import hn.lenguajes.examenreposicion.servicios.SimulacionService;

public class SimulacionServiceImpl implements SimulacionService {

    @Autowired 
    public EquiposService equiposService;
    @Override
    public void simularPartidos() {
        List<Equipos> equipos = equiposService.obtenerTodos();
        
       
        if (equipos.size() < 6) {
            for (Equipos equipoLocal : equipos) {
                for (Equipos equipoVisitante : equipos) {
                    if (!equipoLocal.equals(equipoVisitante)) {
                        simularEncuentro(equipoLocal, equipoVisitante);
                    }
                }
            }
        } else {
            System.out.println("No hay suficientes equipos");
        }

    }
    private void simularEncuentro(Equipos equipoLocal, Equipos equipoVisitante) {
       /* Random random = new Random();
        int golesLocal = random.nextInt(8)+1;
        int golesVisitante = random.nextInt(8)+1;*/

        //crear metodo actualizar
        //actualizarTablaPosiciones(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
    }
}
