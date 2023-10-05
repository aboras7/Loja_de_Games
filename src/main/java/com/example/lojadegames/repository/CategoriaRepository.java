package com.example.lojadegames.repository;

import com.example.lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByGeneroContainingIgnoreCase(@Param("descricao") String descricao);
}
