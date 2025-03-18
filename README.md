# Proyecto de Microservicios con Spring Boot y Docker

Este proyecto implementa dos microservicios utilizando Spring Boot, Oracle BDD y Kafka para la comunicación asíncrona. Los microservicios son:

1. **Cliente y Persona**
2. **Cuenta y Movimiento**

## Requisitos

- Java 11
- Maven
- Docker
- Oracle Database Express Edition
- Kafka

## Configuración del Proyecto

### 1. Clonar el Repositorio

```sh
git clone https://github.com/kjarrin622/microCliente.git
cd microCliente

## Requisitos
Generado el dockerfile procede con los siguientes pasos:
docker build -t microCliente:1.0 .
