FROM openjdk:17

WORKDIR /app

COPY ./target/library-system-0.0.2.jar /app

EXPOSE 8080

CMD ["java", "-jar", "library-system-0.0.2.jar"]