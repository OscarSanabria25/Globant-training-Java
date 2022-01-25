package com.example.GlobanttesisManyToOne.service;

import com.example.GlobanttesisManyToOne.model.Rol;
import com.example.GlobanttesisManyToOne.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements IRolService{
@Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> listarRoles() {
        return (List<Rol>) rolRepository.findAll();
    }
}
