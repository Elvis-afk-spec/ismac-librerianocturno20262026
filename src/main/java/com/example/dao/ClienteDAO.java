package com.example.dao;

import com.example.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO  extends JpaRepository<Cliente, Integer> {
        Cliente findByCedula (String cedula);

}
