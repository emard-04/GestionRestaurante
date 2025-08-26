package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.mesas;
import com.GestionRestaurante.Restaurante.Repository.mesasRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class mesaServicio {
    mesasRepositorio mesasRepo;

    public mesaServicio(mesasRepositorio mesasRepo) {
        this.mesasRepo = mesasRepo;
    }

    public mesas findById(int id){
        return mesasRepo.findById(id).orElse(null);
    }
    public List<mesas> findAll(){
        return mesasRepo.findAll();
    }
    public void Save(mesas mesa){
        mesasRepo.save(mesa);
    }
    public void Delete(int id){
        mesasRepo.deleteById(id);
    }
}