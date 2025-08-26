package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Puesto;
import com.GestionRestaurante.Restaurante.Repository.PuestoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoServicio {
    PuestoRepositorio puestoRepo;

    public PuestoServicio(PuestoRepositorio puestoRepo) {
        this.puestoRepo = puestoRepo;
    }

    public Puesto findById(int id){
        return puestoRepo.findById(id).orElse(null);
    }
    public List<Puesto> findAll(){
        return puestoRepo.findAll();
    }
    public void Save(Puesto puesto){
        puestoRepo.save(puesto);
    }
    public void Delete(int id){
        puestoRepo.deleteById(id);
    }
}