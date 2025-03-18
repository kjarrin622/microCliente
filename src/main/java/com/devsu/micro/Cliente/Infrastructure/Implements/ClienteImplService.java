package com.devsu.micro.Cliente.Infrastructure.Implements;

import com.devsu.micro.Cliente.Application.Ports.Output.ClienteOutputPort;
import com.devsu.micro.Cliente.Domains.Repository.ClienteRepository;
import com.devsu.micro.Cliente.Models.Cliente;
import com.devsu.micro.Cliente.Presentation.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImplService implements ClienteOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado"));
    }

    public Cliente updateCliente(Long id, Cliente clienteDetails) {
        Cliente cliente = getClienteById(id);
        cliente.setNombre(clienteDetails.getNombre());
        cliente.setGenero(clienteDetails.getGenero());
        cliente.setEdad(clienteDetails.getEdad());
        cliente.setIdentificacion(clienteDetails.getIdentificacion());
        cliente.setDireccion(clienteDetails.getDireccion());
        cliente.setTelefono(clienteDetails.getTelefono());
        cliente.setClienteId(clienteDetails.getClienteId());
        cliente.setContraseña(clienteDetails.getContraseña());
        cliente.setEstado(clienteDetails.getEstado());
        return clienteRepository.save(cliente);
    }

    public String deleteCliente(Long id) {
        Cliente cliente = getClienteById(id);
        clienteRepository.delete(cliente);
        return "Cliente eliminado";
    }
}
