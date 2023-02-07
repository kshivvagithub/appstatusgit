# For Java 8
# FROM openjdk:8-jdk-alpine

# For Java 11
# FROM adoptopenjdk/openjdk11:alpine-jre

# For Java 17
FROM openjdk:17-jdk-slim

# Refer to Maven build -> finalName
ARG JAR_FILE=target/appstatusgit-1.0.1.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/appstatusgit-1.0.1.jar /opt/app/appstatusgit.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/appstatusgit.jar
ENTRYPOINT ["java","-jar","appstatusgit.jar"]