FROM gradle:jdk8 as build
COPY . /java-demo
WORKDIR /java-demo
RUN chmod +x ./gradlew && ./gradlew build

FROM openjdk:8-jre-alpine as final
EXPOSE 8080
COPY --from=build /java-demo/build/libs/my-app-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "my-app-1.0-SNAPSHOT.jar"]
