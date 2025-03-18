package com.devsu.micro.Cliente.Application.Ports.Input;

import com.devsu.micro.Cliente.Models.Cliente;

import java.util.List;

public interface ClienteGetUseCase {
    Cliente saveCliente(Cliente cliente);
    List<Cliente> getAllClientes();
    Cliente getClienteById(Long id);
    Cliente updateCliente(Long id, Cliente clienteDetails);
    String deleteCliente(Long id);
}
