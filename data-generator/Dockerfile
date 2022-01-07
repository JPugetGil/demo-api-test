FROM maven AS build
WORKDIR /app
COPY . .
RUN ["mvn", "package"]

FROM eclipse-temurin:11
RUN mkdir /opt/app
COPY --from=build /app/target/data-generator-0.0.1-SNAPSHOT.jar /opt/app/data-generator.jar
CMD ["java", "-jar", "/opt/app/data-generator.jar"]