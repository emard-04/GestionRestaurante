package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Pedidos;
import com.GestionRestaurante.Restaurante.Repository.PedidosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosServicio {
    PedidosRepositorio pedidosRepo;

    public PedidosServicio(PedidosRepositorio pedidosRepo) {
        this.pedidosRepo = pedidosRepo;
    }

    public Pedidos findById(int id){
        return pedidosRepo.findById(id).orElse(null);
    }
    public List<Pedidos> findAll(){
        return pedidosRepo.findAll();
    }
    public void Save(Pedidos pedidos){
        pedidosRepo.save(pedidos);
    }
    public void Delete(int id){
        pedidosRepo.deleteById(id);
    }
}