FROM java:8
COPY . /var/www/java
WORKDIR /var/www/java
RUN ./gradlew build
WORKDIR ./build/libs
CMD ["java","-jar" "MarsRover-1.0-SNAPSHOTS.jar"]
