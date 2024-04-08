FROM openjdk:17-ea-11-slim
VOLUME /tmp
COPY target/member-service-1.0.jar Member-Service.jar
ENTRYPOINT ["java", "-jar", "Member-Service.jar"]