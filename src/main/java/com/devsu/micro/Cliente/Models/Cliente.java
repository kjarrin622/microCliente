package com.devsu.micro.Cliente.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente extends Persona {
    private String clienteId;
    private String contraseña;
    private String estado;
}