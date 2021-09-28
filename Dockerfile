FROM  openjdk:8u302-jre-slim-buster

WORKDIR /usr/local/test

COPY /build/libs/*.jar app.jar

CMD [ "java", "-jar", "app.jar" ]