FROM anapsix/alpine-java:8

ADD ./target/auth-service.jar /app/
CMD ["java", "-Xmx128m", "-jar", "/app/auth-service.jar"]

EXPOSE 5000
