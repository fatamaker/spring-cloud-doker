FROM eclipse-temurin:21-jdk
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="fatma.com"
# Add the application's jar to the image
COPY target/configServer-0.0.1-SNAPSHOT.jar configServer-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "configServer-0.0.1-SNAPSHOT.jar"]