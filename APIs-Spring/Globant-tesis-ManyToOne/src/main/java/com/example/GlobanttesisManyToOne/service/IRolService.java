package com.example.GlobanttesisManyToOne.service;

import com.example.GlobanttesisManyToOne.model.Rol;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRolService {

    List<Rol>listarRoles();
}
