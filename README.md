# MySqlSpringBootDocker

Spring Boot on Docker connecting to MySQL Docker container
Use MySQL Image published by Docker Hub (https://hub.docker.com/_/mysql/) Command to run the mysql container docker run --name mysql-spring-boot-docker-application -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=trial -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6

In the Spring Boot Application, use the same container name of the mysql instance in the application.properties spring.datasource.url = jdbc:mysql://mysql-spring-boot-docker:3306/trial

Create a Dockerfile for creating a docker image from the Spring Boot Application FROM openjdk:8 ADD target/mysql-spring-boot-docker-application.jar mysql-spring-boot-docker-application.jar EXPOSE 8081 ENTRYPOINT ["java", "-jar", "mysql-spring-boot-docker-application.jar"]

Using the Dockerfile create the Docker image. From the directory of Dockerfile - docker build . -t mysql-spring-boot-docker-application

Run the Docker image (mysql-spring-boot-docker-application) created. docker run -p 8081:8081 --name mysql-spring-boot-docker-application --link mysql-spring-boot-docker:mysql -d mysql-spring-boot-docker-application:0.0.1

Useful Docker commands
docker pull mysql:5.6
docker images
docker container ls
docker logs <container_name>
docker container rm <container_name>
docker image rm <image_name>



