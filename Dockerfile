# Usa una imagen base de Java
FROM openjdk:17

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR construido de tu aplicación Spring Boot al contenedor
COPY target/api-gateway-4.1.2-SNAPSHOT.jar /app/api-gateway-4.1.2-SNAPSHOT.jar

# Expone el puerto en el que tu aplicación se ejecutará dentro del contenedor
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "api-gateway-4.1.2-SNAPSHOT.jar"]
