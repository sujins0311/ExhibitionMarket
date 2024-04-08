FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/item-service-1.0.jar Item-Service.jar
ENTRYPOINT ["java", "-jar", "Item-Service.jar"]