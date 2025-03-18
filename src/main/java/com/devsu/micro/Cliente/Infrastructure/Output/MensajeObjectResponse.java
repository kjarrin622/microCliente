package com.devsu.micro.Cliente.Infrastructure.Output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
public class MensajeObjectResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("respuesta")
    private Map<String, String> respuesta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("resultado")
    private Object resultado;

    public MensajeObjectResponse(Map<String, String> respuesta) {
        this.respuesta = respuesta;
    }

    public MensajeObjectResponse(Map<String, String> respuesta, Object resultado) {
        this.respuesta = respuesta;
        this.resultado = resultado;
    }
}
