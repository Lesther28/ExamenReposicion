package hn.lenguajes.examenreposicion.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.examenreposicion.modelos.Posiciones;
import hn.lenguajes.examenreposicion.servicios.Impl.PosicionesServiceImpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionesController {

    @Autowired
    public PosicionesServiceImpl PSI;
    
    @GetMapping("/todos")
public List<Posiciones> obtenerTodos(){
    return this.PSI.obtenerTodos();
}
    
}
