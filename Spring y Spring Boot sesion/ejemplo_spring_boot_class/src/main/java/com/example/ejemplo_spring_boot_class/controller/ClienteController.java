package com.example.ejemplo_spring_boot_class.controller;

import com.example.ejemplo_spring_boot_class.dao.ClientDao;
import com.example.ejemplo_spring_boot_class.dao.ClienteDaoImpl;
import com.example.ejemplo_spring_boot_class.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClienteController {


   // private ClientDao clienteDao =new ClienteDaoImpl();
@Autowired
private ClientDao clienteDao;

    public ClienteController(ClienteDaoImpl clienteDao) {
        this.clienteDao = clienteDao;
    }
    @PostMapping("/clients")
    public  void saveClient(Cliente cliente){
clienteDao.save(cliente);
    }
}
