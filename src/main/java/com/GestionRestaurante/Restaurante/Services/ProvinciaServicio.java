package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Provincia;
import com.GestionRestaurante.Restaurante.Repository.ProvinciaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaServicio {
    ProvinciaRepositorio provinciaRepo;

    public ProvinciaServicio(ProvinciaRepositorio provinciaRepo) {
        this.provinciaRepo = provinciaRepo;
    }

    public Provincia findById(int id){
        return provinciaRepo.findById(id).orElse(null);
    }
    public List<Provincia> findAll(){
        return provinciaRepo.findAll();
    }
    public void Save(Provincia provincia){
        provinciaRepo.save(provincia);
    }
    public void Delete(int id){
        provinciaRepo.deleteById(id);
    }
}