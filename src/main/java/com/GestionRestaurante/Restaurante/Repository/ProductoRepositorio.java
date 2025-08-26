package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String> {
}