package com.example.GlobanttesisManyToOne.service;

import com.example.GlobanttesisManyToOne.model.Usuario;
import com.example.GlobanttesisManyToOne.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> Listarusuarios() {

        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Long id) {

        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(Long id) {
usuarioRepository.deleteById(id);
    }
}
