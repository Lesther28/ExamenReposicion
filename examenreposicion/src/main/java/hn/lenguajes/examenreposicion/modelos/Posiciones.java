package hn.lenguajes.examenreposicion.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "posiciones")
@NoArgsConstructor
@AllArgsConstructor
public class Posiciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_equipo;

    private int empates;
    private int ganados;
    private int perdidos;
    private int goles_favor;
    private int goles_contra;
    private int puntos;

    @OneToOne(mappedBy = "posiciones")
    private Equipos equipos;

}
