FROM amazoncorretto:11-alpine-jdk

# Install Maven
RUN apk add  maven

# Copy and build the Spring Boot project
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Expose port and run the application
EXPOSE 8761
ENTRYPOINT ["java","-jar", "/app/target/service-registry-0.0.1-SNAPSHOT.jar"]