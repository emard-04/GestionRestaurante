package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservasRepositorio extends JpaRepository<Reservas, Integer> {
}