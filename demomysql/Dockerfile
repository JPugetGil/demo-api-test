FROM maven AS build
WORKDIR /app
COPY . .
RUN ["mvn", "package"]

FROM eclipse-temurin:11
RUN mkdir /opt/app
COPY --from=build /app/target/demomysql-0.0.1-SNAPSHOT.jar /opt/app/demomysql.jar
CMD ["java", "-jar", "/opt/app/demomysql.jar"]