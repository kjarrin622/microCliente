package com.devsu.micro.Cliente.Domains.Repository;

import com.devsu.micro.Cliente.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}