FROM openjdk:17
WORKDIR /app
COPY target/* .
CMD ["java", "jar", "secureapp_demo-0.0.1-SNAPSHOT.jar"]
