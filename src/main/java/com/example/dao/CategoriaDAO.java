package com.example.dao;

import com.example.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository<Categoria, Integer> {
    Categoria findByCategoria (String categoria);

    //hola mi categoria perfecta es grindark
}
