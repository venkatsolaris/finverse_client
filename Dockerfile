FROM openjdk:11

COPY target/spring-boot-keycloak-example-0.0.1-SNAPSHOT.jar spring-boot-keycloak-example-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar" , "/spring-boot-keycloak-example-0.0.1-SNAPSHOT.jar"]