FROM  openjdk:17-jdk-slim

WORKDIR /app

COPY target/consumer-0.0.1-SNAPSHOT.jar consumerApp

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "consumerApp"]