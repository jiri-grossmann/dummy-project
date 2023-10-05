FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
WORKDIR /app

COPY src/* /src/
COPY gradle/* /gradle/wrapper/
COPY . .

RUN ./gradlew build

COPY build/libs/dummy-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
