FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/ems-config-service-1.0.jar Ems-Config-Service.jar
ENTRYPOINT ["java", "-jar", "Ems-Config-Service.jar"]