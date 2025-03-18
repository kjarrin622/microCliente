FROM openjdk:17-jdk-alpine
LABEL authors="Kevin Jarrín"

# Variables de entorno para la aplicación Java
ENV JAVA_OPTS=""

# Crear un directorio en el contenedor para la aplicación
WORKDIR /app

# Copiar el archivo .war al directorio de la aplicación en el contenedor
COPY target/microCliente-1.0.0.jar /app/microCliente-1.0.0.jar

# Comando para iniciar la aplicación
ENTRYPOINT exec java $JAVA_OPTS -jar /app/microCliente-1.0.0.jar

# Puerto en el que se ejecutará la aplicación
EXPOSE 4401