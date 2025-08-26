package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Producto;
import com.GestionRestaurante.Restaurante.Repository.ProductoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {
    ProductoRepositorio productoRepo;

    public ProductoServicio(ProductoRepositorio productoRepo) {
        this.productoRepo = productoRepo;
    }

    public Producto findById(String id){
        return productoRepo.findById(id).orElse(null);
    }
    public List<Producto> findAll(){
        return productoRepo.findAll();
    }
    public void Save(Producto producto){
        productoRepo.save(producto);
    }
    public void Delete(String id){
        productoRepo.deleteById(id);
    }
}