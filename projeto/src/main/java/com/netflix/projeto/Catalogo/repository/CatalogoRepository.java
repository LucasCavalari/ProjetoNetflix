package com.netflix.projeto.Catalogo.repository;

import com.netflix.projeto.Catalogo.entity.Cata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository<Cata,Integer> {
}
