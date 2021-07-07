FROM amazoncorretto:11
EXPOSE 4780
ADD target/serving-web-content-0.0.1-SNAPSHOT.jar serving-web-content.jar 
ENTRYPOINT ["java","-jar","/serving-web-content.jar"]