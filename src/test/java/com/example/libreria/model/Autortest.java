package com.example.libreria.model;

import com.example.model.Autor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Autortest {
    private Autor autor;
    @BeforeEach
    public void setUp() {
        autor = new Autor(
                1
                , "Ecuador"
                , "Elvis"
                , "Laje"
                , "Quito"
                , "0989459305"
                , "emlaje@tecnologicoismac.edu.ec"
        );
    }
        @Test
        public void testAutorConstructorAndGetters () {
            assertAll("Autores",
                    () -> assertEquals(1, autor.getId_autor()),
                    () -> assertEquals("Ecuador", autor.getPais()),
                    () -> assertEquals("Elvis", autor.getNombre()),
                    () -> assertEquals("Laje", autor.getApellido()),
                    () -> assertEquals("Quito", autor.getDireccion()),
                    () -> assertEquals("0989459305", autor.getTelefono()),
                    () -> assertEquals("emlaje@tecnologicoismac.edu.ec", autor.getCorreo())
            );
            System.out.println(autor.toString());

    }
}
