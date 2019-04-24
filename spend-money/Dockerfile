FROM anapsix/alpine-java:8

ADD ./target/spend-money.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spend-money.jar"]

EXPOSE 6000
