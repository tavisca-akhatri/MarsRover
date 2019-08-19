FROM java:8
COPY build/libs/ var/www/java
WORKDIR /var/www/java
WORKDIR ./build/libs
CMD ["java" , "-jar", "MarsRover-1.0-SNAPSHOT.jar"]
