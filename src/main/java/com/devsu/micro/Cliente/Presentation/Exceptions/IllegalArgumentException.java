package com.devsu.micro.Cliente.Presentation.Exceptions;

public class IllegalArgumentException extends RuntimeException {
    private String codigo;

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(String codigo, String message) {
        super(message);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
