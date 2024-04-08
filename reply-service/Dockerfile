FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/reply-service-1.0.jar Reply-Service.jar
ENTRYPOINT ["java", "-jar", "Reply-Service.jar"]