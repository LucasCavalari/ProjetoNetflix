package com.netflix.projeto.listener;

import java.io.Serializable;

public class CatalogoTO implements Serializable {

    /**
    *
    */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String senha;
    private String email;

    private Integer guidUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGuidUsuario() {
        return guidUsuario;
    }

    public void setGuidUsuario(Integer guidUsuario) {
        this.guidUsuario = guidUsuario;
    }
}
