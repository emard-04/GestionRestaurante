package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.TurnoEmpleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TurnoEmpleadosRepositorio extends JpaRepository<TurnoEmpleados, Integer> {
}