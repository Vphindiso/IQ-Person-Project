FROM openjdk:8 
ADD target/person-msql.jar person-msql.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "person-msql.jar"]