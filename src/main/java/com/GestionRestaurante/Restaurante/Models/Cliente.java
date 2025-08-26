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
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdCliente;
    private String Nombre, Apellido, email, telefono, estado;

    @OneToMany(mappedBy = "cliente")
    private List<Reservas> reservas;

    @OneToMany(mappedBy = "cliente")
    private List<Pedidos> pedidos;
}