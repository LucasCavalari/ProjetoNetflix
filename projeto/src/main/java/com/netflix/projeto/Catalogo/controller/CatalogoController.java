package com.netflix.projeto.Catalogo.controller;


import com.netflix.projeto.Catalogo.entity.Cata;
import com.netflix.projeto.Catalogo.service.CatalogoService;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/catalogo")
// Api Rest, consumir ou salvar informação de usuario nesse contexto
// Configurar a URL para fazer isso, para disponibilizar serviço
public class CatalogoController {
    @Autowired
    private CatalogoService catalogoService;
    // Quando quero salvar uma informação em uma api rest uso post
    @PostMapping("/salvar")
    // Requesbuddy permite pegar conteudo do corpo na api rest, pega o objeto do cliente
    public void salvar(@RequestBody Cata catalogo) {
      catalogoService.salvar(catalogo);
    }


    @GetMapping("/listar")
    public List<Cata> listar() {
        return catalogoService.listar();
    }

    @GetMapping("/{id}")
    public Cata buscarPorId(@PathVariable("id") Integer id) {
        return catalogoService.buscarPorId(id);
    }

    @GetMapping("/usuario/{id}")
    public Cata buscarPorGuidUsuario(@PathVariable("id") Integer guidUsuario) {
        return catalogoService.buscarPorGuidUsuario(guidUsuario);
    }
}
