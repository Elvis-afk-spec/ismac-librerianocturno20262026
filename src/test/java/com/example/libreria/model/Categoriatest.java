package com.example.libreria.model;

import com.example.model.Autor;
import com.example.model.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Categoriatest {
    private Categoria categoria;
    @BeforeEach
    public void setUp() {
        categoria = new Categoria(
                1
                , "Dark"
                , "Warhammer40k"
        );
    }
    @Test
    public void testCategoriaConstructorAndGetters () {
        assertAll("Categoria",
                () -> assertEquals(1, categoria.getId_categoria()),
                () -> assertEquals("Ecuador", categoria.getDescripcion()),
                () -> assertEquals("Elvis", categoria.getCategoria())
        );
        System.out.println(categoria.toString());

    }
}
