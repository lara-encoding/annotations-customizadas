package io.github.dougllasfps.service;

import io.github.dougllasfps.model.Cliente;
import io.github.dougllasfps.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persitir(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //aplica validações
    }
}
