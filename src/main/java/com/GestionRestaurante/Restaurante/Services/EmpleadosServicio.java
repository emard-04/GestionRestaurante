package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Empleados;
import com.GestionRestaurante.Restaurante.Repository.EmpleadosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadosServicio {
    EmpleadosRepositorio empleadosRepo;

    public EmpleadosServicio(EmpleadosRepositorio empleadosRepo) {
        this.empleadosRepo = empleadosRepo;
    }

    public Empleados findById(int id){
        return empleadosRepo.findById(id).orElse(null);
    }
    public List<Empleados> findAll(){
        return empleadosRepo.findAll();
    }
    public void Save(Empleados empleados){
        empleadosRepo.save(empleados);
    }
    public void Delete(int id){
        empleadosRepo.deleteById(id);
    }
}