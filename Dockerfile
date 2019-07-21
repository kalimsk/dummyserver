FROM openjdk:8
ADD data /data
ADD build/libs/dummyserver-0.0.1-SNAPSHOT.jar dummyserver.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "dummyserver.jar"]