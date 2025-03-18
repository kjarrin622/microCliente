package com.devsu.micro.Cliente;

import com.devsu.micro.Cliente.Domains.Repository.ClienteRepository;
import com.devsu.micro.Cliente.Domains.Services.ClienteService;
import com.devsu.micro.Cliente.Models.Cliente;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MicroClienteApplicationTests {
    @Autowired
    private ClienteService clienteService;

    @MockBean
    private ClienteRepository clienteRepository;

    @Test
    public void testSaveCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setClienteId("123");
        cliente.setContraseña("password");
        cliente.setEstado("activo");

        Mockito.when(clienteRepository.save(cliente)).thenReturn(cliente);

        Cliente savedCliente = clienteService.saveCliente(cliente);
        assertEquals("Juan", savedCliente.getNombre());
    }

}
