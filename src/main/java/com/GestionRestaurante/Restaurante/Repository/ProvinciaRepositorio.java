package com.GestionRestaurante.Restaurante.Repository;

import com.GestionRestaurante.Restaurante.Models.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinciaRepositorio extends JpaRepository<Provincia, Integer> {
}