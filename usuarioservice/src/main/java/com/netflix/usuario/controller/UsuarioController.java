package com.netflix.usuario.controller;

import com.netflix.usuario.entity.Usuario;
import com.netflix.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) throws JsonProcessingException {
        return usuarioService.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable("id") Integer id) {
        return usuarioService.buscarPorId(id);
    }

    @GetMapping("/usuario/{id}")
    public Usuario buscarPorGuidUsuario(@PathVariable("id") Integer guidUsuario) {
        return usuarioService.buscarPorGuidUsuario(guidUsuario);
    }
}
