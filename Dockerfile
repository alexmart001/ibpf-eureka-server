FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/ibpf-eureka-server-0.0.1-SNAPSHOT.jar ibpf-eureka-server.jar
ENTRYPOINT ["java","-jar","/ibpf-eureka-server.jar"]