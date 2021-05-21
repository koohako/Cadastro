package com.cadastros.cd.repository;


import com.cadastros.cd.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
