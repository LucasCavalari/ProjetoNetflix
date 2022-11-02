package com.netflix.projeto.Catalogo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@FeignClient("catalogoservice")
public interface FeignCatalogo {

    //@GetMapping("/api/catalogo")
    //String testarCatalogo();

    @GetMapping("/catalogo/usuario/{id}")
    public CatalogoTo buscarPorGuidUsuario(@PathVariable("id") Integer guidUsuario);

}
