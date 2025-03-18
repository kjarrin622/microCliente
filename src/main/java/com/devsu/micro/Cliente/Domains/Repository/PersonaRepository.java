package com.devsu.micro.Cliente.Domains.Repository;

import com.devsu.micro.Cliente.Models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
