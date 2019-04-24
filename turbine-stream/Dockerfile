FROM anapsix/alpine-java:8

ADD ./target/turbine-stream.jar /app/
CMD ["java", "-Xmx128m", "-jar", "/app/turbine-stream.jar"]

EXPOSE 8989
