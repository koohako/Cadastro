package com.cadastros.cd.controller;

import com.cadastros.cd.model.Usuario;
import com.cadastros.cd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    UsuarioRepository usuarioRepository;

@GetMapping("/")
public String index(Model model){

    model.addAttribute("usuarios",usuarioRepository.findAll());
    model.addAttribute("usuario", new Usuario());

    return "/index";
}

}
