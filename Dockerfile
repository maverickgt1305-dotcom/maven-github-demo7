
# Stage 1: Build the Java application
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn -B -DskipTests package

# Stage 2: Run the packaged application
FROM eclipse-temurin:17-jre-jammy AS runtime

WORKDIR /app

COPY --from=build /app/target/even-odd-checker.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
