FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/score-0.0.1-SNAPSHOT.jar score.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "score.jar"]