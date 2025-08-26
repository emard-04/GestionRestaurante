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
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdReserva;
    private int cant_personas;
    private String estado;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "IdMesa")
    private mesas mesa;
}