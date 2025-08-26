package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.TurnoEmpleados;
import com.GestionRestaurante.Restaurante.Repository.TurnoEmpleadosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoEmpleadosServicio {
    TurnoEmpleadosRepositorio turnoEmpleadosRepo;

    public TurnoEmpleadosServicio(TurnoEmpleadosRepositorio turnoEmpleadosRepo) {
        this.turnoEmpleadosRepo = turnoEmpleadosRepo;
    }

    public TurnoEmpleados findById(int id){
        return turnoEmpleadosRepo.findById(id).orElse(null);
    }
    public List<TurnoEmpleados> findAll(){
        return turnoEmpleadosRepo.findAll();
    }
    public void Save(TurnoEmpleados turnoEmpleados){
        turnoEmpleadosRepo.save(turnoEmpleados);
    }
    public void Delete(int id){
        turnoEmpleadosRepo.deleteById(id);
    }
}