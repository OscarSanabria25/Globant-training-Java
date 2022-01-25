package com.example.GlobanttesisManyToOne.service;

import com.example.GlobanttesisManyToOne.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario>Listarusuarios();
    public  void   guardarUsuario(Usuario usuario);
    public Usuario buscarPorId(Long id);
    public  void eliminarUsuario(Long id);
}
