package com.devsu.micro.Cliente.Presentation.Controller;

import com.devsu.micro.Cliente.Application.Ports.Input.ClienteGetUseCase;
import com.devsu.micro.Cliente.Models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteGetUseCase clienteGetUseCase;

    @Autowired
    public ClienteController(ClienteGetUseCase clienteGetUseCase) {
        this.clienteGetUseCase = clienteGetUseCase;
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteGetUseCase.saveCliente(cliente), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        return new ResponseEntity<>(clienteGetUseCase.getAllClientes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        return new ResponseEntity<>(clienteGetUseCase.getClienteById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
        return new ResponseEntity<>(clienteGetUseCase.updateCliente(id, clienteDetails), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Long id) {

        return new ResponseEntity<>(clienteGetUseCase.deleteCliente(id),HttpStatus.OK);
    }
}