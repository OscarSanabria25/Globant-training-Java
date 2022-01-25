package com.example.GlobanttesisManyToOne.controller;

import com.example.GlobanttesisManyToOne.model.Rol;
import com.example.GlobanttesisManyToOne.model.Usuario;
import com.example.GlobanttesisManyToOne.service.IRolService;
import com.example.GlobanttesisManyToOne.service.IUsuarioService;
import com.example.GlobanttesisManyToOne.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
    private IUsuarioService iUsuarioService;
@Autowired
    private IRolService iRolService;
@GetMapping("/")
public String ListarUsuarios(Model model){
    List<Usuario>listaUsuario =iUsuarioService.Listarusuarios();
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

}
