package com.example.ejemplo_spring_boot_class.dao;

import com.example.ejemplo_spring_boot_class.model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ClienteDaoImpl implements  ClientDao{

    @Override
    public void save(Cliente cliente) {
        System.out.println("client saved");
        System.out.println(cliente.toString());
    }
}
