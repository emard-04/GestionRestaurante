package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoProductoRepositorio extends JpaRepository<TipoProducto, Integer> {
}