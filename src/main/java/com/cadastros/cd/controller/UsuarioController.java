package com.cadastros.cd.controller;

import com.cadastros.cd.model.Usuario;
import com.cadastros.cd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;



    @PostMapping("/usuario/save")
    public String save(Usuario usuario){

        try {
            usuarioRepository.save(usuario);
        }catch (Exception e){
            System.out.println(e);
        }

        return "redirect:/";
    }



}
