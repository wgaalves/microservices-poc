FROM anapsix/alpine-java:8

ADD ./target/monitoring.jar /app/
CMD ["java", "-Xmx128m", "-jar", "/app/monitoring.jar"]

EXPOSE 8080
