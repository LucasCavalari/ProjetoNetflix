package com.netflix.projeto.Catalogo.service;

import com.netflix.projeto.Catalogo.entity.Cata;
import com.netflix.projeto.Catalogo.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    public void salvar(Cata catalogo) {
        catalogoRepository.save(catalogo);
    }

    public List<Cata> listar() {
        return catalogoRepository.findAll();
    }

    public Cata buscarPorId(Integer id) {
        return new Cata();
    }

    public Cata buscarPorGuidUsuario(Integer guidUsuario) {
        return new Cata();
    }
}
