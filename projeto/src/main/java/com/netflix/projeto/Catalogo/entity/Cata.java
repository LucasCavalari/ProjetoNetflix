package com.netflix.projeto.Catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cata {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
