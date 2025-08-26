package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidosRepositorio extends JpaRepository<Pedidos, Integer> {
}