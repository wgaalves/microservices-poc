FROM anapsix/alpine-java:8

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx128m", "-jar", "/app/registry.jar"]

EXPOSE 8761
