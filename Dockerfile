FROM openjdk:10-jre-slim
ADD build/libs/sigcatch-*.jar /sigcatch.jar
ENTRYPOINT ["java", "-jar", "/sigcatch.jar"]