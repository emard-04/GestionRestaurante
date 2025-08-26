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
public class mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMesa;
    private int capacidad;
    private String estado;

    @OneToMany(mappedBy = "mesa")
    private List<Reservas> reservas;

    @OneToMany(mappedBy = "mesa")
    private List<Pedidos> pedidos;
}