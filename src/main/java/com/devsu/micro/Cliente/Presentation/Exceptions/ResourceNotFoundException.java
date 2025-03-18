package com.devsu.micro.Cliente.Presentation.Exceptions;

import java.util.HashMap;
import java.util.Map;

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
public class ResourceNotFoundException extends RuntimeException {
    private Map<String, String> respuesta;

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String codigo, String message) {
        respuesta = new HashMap<>();
        this.respuesta.put("codigo", codigo);
        this.respuesta.put("message", message);
    }

}
