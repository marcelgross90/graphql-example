FROM openjdk:8-jdk-alpine

COPY graphql.server/target/graphql-full.jar /app/

EXPOSE 8080
WORKDIR /app

ENTRYPOINT ["java", "-jar", "-Done-jar.silent=true", "-Dspring.profiles.active=docker", "graphql-full.jar"]
