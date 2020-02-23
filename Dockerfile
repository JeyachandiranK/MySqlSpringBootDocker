FROM openjdk:8
ADD target/mysql-spring-boot-docker-application.jar mysql-spring-boot-docker-application.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "mysql-spring-boot-docker-application.jar"]