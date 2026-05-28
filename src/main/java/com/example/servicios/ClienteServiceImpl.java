package com.example.servicios;

import com.example.dao.ClienteDAO;
import com.example.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente findOne(int id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }
    @Override
    public Cliente update(int id, Cliente cliente) {
        Cliente clienteExistente = findOne(id);

        if (clienteExistente == null) {
            return null;
        }

        clienteExistente.setCedula(cliente.getCedula());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setApellido(cliente.getApellido());
        clienteExistente.setDireccion(cliente.getDireccion());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());


        return clienteDAO.save(clienteExistente);
    }

    @Override
    public void delete(int id) {
        if(clienteDAO.existsById(id)){
            clienteDAO.deleteById(id);
        }

    }
}
