package com.cadastros.cd.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testGetId() {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        long id = usuario.getId();
        assertEquals(1, id);
    }

    @Test
    void testSetId() {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        long id = usuario.getId();
        assertEquals(1, id);
    }

    @Test
    void testGetEmail() {
        Usuario usuario = new Usuario();
        usuario.setEmail("xarturellerx@gmail.com");
        String email = usuario.getEmail();
        assertEquals("xarturellerx@gmail.com", email);
    }

    @Test
    void testSetEmail() {
        Usuario usuario = new Usuario();
        usuario.setEmail("xarturellerx@gmail.com");
        String email = usuario.getEmail();
        assertEquals("xarturellerx@gmail.com", email);
    }

    @Test
    void testGetNome() {
        Usuario usuario = new Usuario();
        usuario.setNome("Artur");
        String nome = usuario.getNome();
        assertEquals("Artur", nome);
    }

    @Test
    void testSetNome() {
        Usuario usuario = new Usuario();
        usuario.setNome("Artur");
        String nome = usuario.getNome();
        assertEquals("Artur", nome);
    }

    @Test
    void testToString() {
        Usuario usuario = new Usuario();
        String toString = usuario.toString();
        assertEquals("toString do usuario", toString);
    }

}