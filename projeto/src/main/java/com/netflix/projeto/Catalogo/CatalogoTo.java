package com.netflix.projeto.Catalogo;

import javax.persistence.criteria.CriteriaBuilder;

public class CatalogoTo {

    private Integer id;
    private String usuario;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
