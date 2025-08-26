package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPuesto;
    private String Descripcion;

    @OneToMany(mappedBy = "puesto")
    private List<Empleados> empleados;
}