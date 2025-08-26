package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Reservas;
import com.GestionRestaurante.Restaurante.Repository.ReservasRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservasServicio {
    ReservasRepositorio reservasRepo;

    public ReservasServicio(ReservasRepositorio reservasRepo) {
        this.reservasRepo = reservasRepo;
    }

    public Reservas findById(int id){
        return reservasRepo.findById(id).orElse(null);
    }
    public List<Reservas> findAll(){
        return reservasRepo.findAll();
    }
    public void Save(Reservas reserva){
        reservasRepo.save(reserva);
    }
    public void Delete(int id){
        reservasRepo.deleteById(id);
    }
}