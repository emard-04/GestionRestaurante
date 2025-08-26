package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class TurnoEmpleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTurno;
    private Date fecha;
    private String hora_inicio, hora_fin;

    @ManyToOne
    @JoinColumn(name = "IdEmpleado")
    private Empleados empleado;
}