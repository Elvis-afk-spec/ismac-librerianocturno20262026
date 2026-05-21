package com.example.libreria.model;

import com.example.model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Clientetest {

    private Cliente cliente;
    @BeforeEach
    public void setUp(){
        cliente = new Cliente (
            1
            ,"0943801175"
            ,"Elvis"
            ,"Laje"
            ,"Quito"
            , "0989459305"
            ,"emlaje@tecnologicoismac.edu.ec"
    );
    }
    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias - Constructor y Getters - Cliente",
                () -> assertEquals(1, cliente.getId_cliente()),
                () -> assertEquals("0943801175", cliente.getCedula()),
                () -> assertEquals("Elvis", cliente.getNombre()),
                () -> assertEquals("Laje", cliente.getApellido()),
                () -> assertEquals("Quito", cliente.getDireccion()),
                () -> assertEquals("0989459305", cliente.getTelefono()),
                () -> assertEquals("emlaje@tecnologicoismac.edu.ec", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteSetters(){
        cliente.setId_cliente(0);
        cliente.setCedula("898565455");
        cliente.setNombre("bob");
        cliente.setApellido("Cuadrado");
        cliente.setDireccion("enelmar");
        cliente.setTelefono("0987654322");
        cliente.setCorreo("pay@correo.com");

        assertAll("Pruebas unitarias - Setteres - Cliente",
                () -> assertEquals(0, cliente.setId_cliente()),
                () -> assertEquals("898565455", cliente.getCedula()),
                () -> assertEquals("bob", cliente.getNombre()),
                () -> assertEquals("Cuadrado", cliente.getApellido()),
                () -> assertEquals("enelmar", cliente.getDireccion()),
                () -> assertEquals("0987654322", cliente.getTelefono()),
                () -> assertEquals("pay@correo.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }
    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Validad datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("0943801175")),
                () -> assertTrue(str.contains("Elvis")),
                () -> assertTrue(str.contains("Laje")),
                () -> assertTrue(str.contains("Quito")),
                () -> assertTrue(str.contains("0989459305")),
                () -> assertTrue(str.contains("emlaje@tecnologicoismac.edu.ec"))
        );
    }

}
