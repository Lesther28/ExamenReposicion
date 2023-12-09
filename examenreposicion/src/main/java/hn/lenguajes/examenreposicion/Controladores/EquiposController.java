package hn.lenguajes.examenreposicion.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.examenreposicion.modelos.Equipos;
import hn.lenguajes.examenreposicion.servicios.EquiposService;
import hn.lenguajes.examenreposicion.servicios.Impl.EquiposServiceImpl;

@RestController
@RequestMapping("/api/equipo")
public class EquiposController {
     @Autowired 
    public EquiposServiceImpl ESI;

    @Autowired
    public EquiposService equiposService;

    
    @PostMapping("/crear")
    public Equipos crearEquipo (@RequestBody Equipos nvoEquipo){
    return this.ESI.crearEquipo(nvoEquipo); 
    }

    @GetMapping("/buscar/{codigoEquipo}")
    public ResponseEntity<Equipos> buscarEquipo(@PathVariable int codigoEquipo) {
        Equipos equipo = equiposService.buscarEquipoPorCodigo(codigoEquipo);
        if (equipo != null) {
            return ResponseEntity.ok(equipo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{codigoEquipo}")
    public ResponseEntity<String> eliminarEquipo(@PathVariable int codigoEquipo) {
        try {
            equiposService.eliminarEquipo(codigoEquipo);
            return ResponseEntity.ok("Equipo eliminado correctamente.");
        } catch (IllegalStateException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


}
