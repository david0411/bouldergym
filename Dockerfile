FROM eclipse-temurin:17-jdk-focal
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/bouldergym-0.0.1-SNAPSHOT.jar bouldergym.jar
ENTRYPOINT ["java","-jar","/bouldergym.jar"]