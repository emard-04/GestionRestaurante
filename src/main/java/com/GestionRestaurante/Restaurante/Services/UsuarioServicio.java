package com.GestionRestaurante.Restaurante.Services;

import com.GestionRestaurante.Restaurante.Models.Usuario;
import com.GestionRestaurante.Restaurante.Repository.UsuarioRepositorio;

import java.util.List;
import java.util.Optional;

public class UsuarioServicio {
    UsuarioRepositorio usuarioRepo;
    public Usuario findById(int id){
        return usuarioRepo.findById(id).orElse(null);
    }
    public List<Usuario> findAll(){
        return usuarioRepo.findAll();
    }
    public void Save(Usuario usuario){
         usuarioRepo.save(usuario);
    }
    public void Delete(int id){
        usuarioRepo.deleteById(id);
    }

}
