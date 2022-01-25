package com.example.testingPrueba.service;


import com.example.testingPrueba.model.Usuario;
import com.example.testingPrueba.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario>listarUsers() {
        return usuarioRepository.findAll();
    }
    public void registrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario buscarById(Integer id){
        return usuarioRepository.findById(id).get();
    }

    public void eliminarUser(Integer id){
        usuarioRepository.deleteById(id);
    }
}

