FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/ems-discovery-service-1.0.jar Ems-Discovery-Service.jar
ENTRYPOINT ["java", "-jar", "Ems-Discovery-Service.jar"]