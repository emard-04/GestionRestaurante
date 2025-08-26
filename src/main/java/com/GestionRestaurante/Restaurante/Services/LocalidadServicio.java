package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Localidad;
import com.GestionRestaurante.Restaurante.Repository.LocalidadRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadServicio {
    LocalidadRepositorio localidadRepo;

    public LocalidadServicio(LocalidadRepositorio localidadRepo) {
        this.localidadRepo = localidadRepo;
    }

    public Localidad findById(int id){
        return localidadRepo.findById(id).orElse(null);
    }
    public List<Localidad> findAll(){
        return localidadRepo.findAll();
    }
    public void Save(Localidad localidad){
        localidadRepo.save(localidad);
    }
    public void Delete(int id){
        localidadRepo.deleteById(id);
    }
}