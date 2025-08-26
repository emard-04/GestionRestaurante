package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEmpleado;
    private String Nombre, Apellido, telefono, Email, Estado;

    @ManyToOne
    @JoinColumn(name = "IdPuesto")
    private Puesto puesto;

    @OneToMany(mappedBy = "empleado")
    private List<TurnoEmpleados> turnos;
}