package com.devsu.micro.Cliente.Domains.Services;

import com.devsu.micro.Cliente.Application.Ports.Input.ClienteGetUseCase;
import com.devsu.micro.Cliente.Application.Ports.Output.ClienteOutputPort;
import com.devsu.micro.Cliente.Models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ClienteGetUseCase {

    private final ClienteOutputPort clienteOutputPort;

    @Autowired
    public ClienteService(ClienteOutputPort clienteOutputPort) {
        this.clienteOutputPort = clienteOutputPort;
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteOutputPort.saveCliente(cliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteOutputPort.getAllClientes();
    }

    @Override
    public Cliente getClienteById(Long id) {
        return clienteOutputPort.getClienteById(id);
    }

    @Override
    public Cliente updateCliente(Long id, Cliente clienteDetails) {
        return clienteOutputPort.updateCliente(id, clienteDetails);
    }

    @Override
    public String deleteCliente(Long id) {
        return clienteOutputPort.deleteCliente(id);
    }
}
