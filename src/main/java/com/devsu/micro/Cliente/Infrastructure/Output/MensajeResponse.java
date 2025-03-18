package com.devsu.micro.Cliente.Infrastructure.Output;

import lombok.Data;

import java.io.Serializable;

@Data
public class MensajeResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codigo;
    private String mensaje;

    public MensajeResponse(String codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }


}
