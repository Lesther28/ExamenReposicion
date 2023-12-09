package hn.lenguajes.examenreposicion.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "equipos")
@NoArgsConstructor
@AllArgsConstructor
public class Equipos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_equipo;

    private String nombre;
    private double ataque;
    private double defensa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_equipo", referencedColumnName = "codigo_equipo")
    private Posiciones posiciones;
    
}
