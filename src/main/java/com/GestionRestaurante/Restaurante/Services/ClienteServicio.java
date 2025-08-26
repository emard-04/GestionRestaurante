package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Cliente;
import com.GestionRestaurante.Restaurante.Repository.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {
    ClienteRepositorio clienteRepo;

    public ClienteServicio(ClienteRepositorio clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public Cliente findById(int id){
        return clienteRepo.findById(id).orElse(null);
    }
    public List<Cliente> findAll(){
        return clienteRepo.findAll();
    }
    public void Save(Cliente cliente){
        clienteRepo.save(cliente);
    }
    public void Delete(int id){
        clienteRepo.deleteById(id);
    }
}