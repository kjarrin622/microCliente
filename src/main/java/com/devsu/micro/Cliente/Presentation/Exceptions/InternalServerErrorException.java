package com.devsu.micro.Cliente.Presentation.Exceptions;

/**
 * Proyecto: NombreDelProyecto
 * Institución: Registro Civil
 * Módulo: NombreDelModulo
 * Descripción: Esta clase representa...
 * <p>
 * Fecha de Creación: yyyy-mm-dd
 * Creado por: Nombre del Creador
 * <p>
 * Fecha de Modificación: yyyy-mm-dd
 * Modificado por: Nombre del Modificador
 * Descripción de la Modificación: Breve descripción de los cambios
 * realizados.
 */
public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException() {
        super();
    }

    public InternalServerErrorException(String message) {
        super(message);
    }
}
