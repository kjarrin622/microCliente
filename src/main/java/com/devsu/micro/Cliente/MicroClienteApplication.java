package com.devsu.micro.Cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("Models")
public class MicroClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroClienteApplication.class, args);
    }

}
