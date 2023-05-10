FROM openjdk:17-jdk-alpine
ARG JAE_FILE=target/*.jar
COPY ./target/delivery_service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]