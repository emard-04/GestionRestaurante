package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.TipoProducto;
import com.GestionRestaurante.Restaurante.Repository.TipoProductoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoProductoServicio {
    TipoProductoRepositorio tipoProductoRepo;

    public TipoProductoServicio(TipoProductoRepositorio tipoProductoRepo) {
        this.tipoProductoRepo = tipoProductoRepo;
    }

    public TipoProducto findById(int id){
        return tipoProductoRepo.findById(id).orElse(null);
    }
    public List<TipoProducto> findAll(){
        return tipoProductoRepo.findAll();
    }
    public void Save(TipoProducto tipoProducto){
        tipoProductoRepo.save(tipoProducto);
    }
    public void Delete(int id){
        tipoProductoRepo.deleteById(id);
    }
}