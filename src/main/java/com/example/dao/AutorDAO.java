package com.example.dao;

import com.example.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorDAO extends JpaRepository<Autor, Integer> {
    Autor findByPais (String pais);

    //esta es autor Benjamin Franklin
}
