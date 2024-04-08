FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/ems-apigateway-service-1.0.jar Ems-Apigateway-Service.jar
ENTRYPOINT ["java", "-jar", "Ems-Apigateway-Service.jar"]