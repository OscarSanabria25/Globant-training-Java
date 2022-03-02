package com.example.GlobanttesisManyToOne.controller;

import com.example.GlobanttesisManyToOne.model.Persona;
import com.example.GlobanttesisManyToOne.model.Rol;
import com.example.GlobanttesisManyToOne.model.Usuario;
import com.example.GlobanttesisManyToOne.service.IRolService;
import com.example.GlobanttesisManyToOne.service.IUsuarioService;
import com.example.GlobanttesisManyToOne.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
    private IUsuarioService usuarioService;
@Autowired
    private IRolService iRolService;
@GetMapping("/")
public String ListarUsuarios(Model model){
    List<Usuario>listaUsuario =usuarioService.Listarusuarios();
model.addAttribute("titulo","Lista de usuarios");
model.addAttribute("usuarios",listaUsuario );
return "/usuarios/listar";
}
@GetMapping("/create")
public  String crearUsuario(Model model){
    Usuario usuario= new Usuario();
    List<Rol>listaRol=iRolService.listarRoles();
    model.addAttribute("titulo", "Formulario: Nuevo Usuario");
    model.addAttribute("usuario",usuario);
    model.addAttribute("roles",listaRol);
return "/usuarios/crearUsuario";
}

@PostMapping("/guardar")
public  void  saveUser(Usuario usuario){

    usuarioService.guardarUsuario(usuario);
}





    @GetMapping("/personas")
    public String showmenu(Model model){
        Persona p1 =new Persona();
        p1.setId(1);
        p1.setNombre("juan");

        Persona p2 =new Persona();
        p2.setId(2);
        p2.setNombre("pedro");

        var listaDePersonas= new ArrayList();

        listaDePersonas.add(p1);
        listaDePersonas.add(p2);

        model.addAttribute("personas", listaDePersonas);

        return "personas";
    }

}
