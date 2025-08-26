package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Detalle_pedido;
import com.GestionRestaurante.Restaurante.Repository.Detalle_pedidoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Detalle_pedidoServicio {
    Detalle_pedidoRepositorio detalle_pedidoRepo;

    public Detalle_pedidoServicio(Detalle_pedidoRepositorio detalle_pedidoRepo) {
        this.detalle_pedidoRepo = detalle_pedidoRepo;
    }

    public Detalle_pedido findById(int id){
        return detalle_pedidoRepo.findById(id).orElse(null);
    }
    public List<Detalle_pedido> findAll(){
        return detalle_pedidoRepo.findAll();
    }
    public void Save(Detalle_pedido detalle_pedido){
        detalle_pedidoRepo.save(detalle_pedido);
    }
    public void Delete(int id){
        detalle_pedidoRepo.deleteById(id);
    }
}