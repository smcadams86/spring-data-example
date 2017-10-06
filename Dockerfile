FROM openjdk:8-jdk-alpine
ADD build/libs/*.jar app.jar
RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS="-XX:+UseG1GC -Xms2048m -Xmx2048m -XX:-OmitStackTraceInFastThrow"
ENTRYPOINT [ "sh", "-c", "/usr/bin/java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]