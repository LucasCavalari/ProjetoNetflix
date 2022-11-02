package com.netflix.projeto.usuario.controller;

import com.netflix.projeto.usuario.entity.Usuario;
import com.netflix.projeto.usuario.service.UsuarioService;
import com.netflix.projeto.util.excecao.ExcecaoExemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")


// Api Rest, consumir ou salvar informação de usuario nesse contexto
// Configurar a URL para fazer isso, para disponibilizar serviço
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Usuario usuario) throws ExcecaoExemplo {
        usuario = usuarioService.salvar(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable("id") Integer id) {
        try {
            Usuario usuario = usuarioService.buscarPorId(id);
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Integer id) {
        usuarioService.excluir(id);
    }

}


