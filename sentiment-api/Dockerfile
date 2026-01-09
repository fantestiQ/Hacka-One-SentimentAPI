# Usa uma imagem do Java 17
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

RUN mkdir -p logs
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]