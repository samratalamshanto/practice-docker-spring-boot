FROM openjdk:21
WORKDIR /app
EXPOSE 9090
COPY target/basic-docker-practice-spring-boot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]