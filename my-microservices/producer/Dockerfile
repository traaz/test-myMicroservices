FROM  openjdk:17-jdk-slim

WORKDIR /app

COPY target/producer-0.0.1-SNAPSHOT.jar producerApp

EXPOSE 8079

ENTRYPOINT ["java", "-jar", "producerApp"]
