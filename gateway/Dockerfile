FROM anapsix/alpine-java:8

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx128m", "-jar", "/app/gateway.jar"]

EXPOSE 4000
