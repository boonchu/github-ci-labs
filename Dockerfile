FROM gradle:jdk8
COPY . /java-demo
WORKDIR /java-demo
RUN ./gradlew build

FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY --from=build /java-demo/build/libs/my-app-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "my-app-1.0-SNAPSHOT.jar"]
