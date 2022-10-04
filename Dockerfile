FROM openjdk:8
COPY target/k8s-spring-demo-1.2.0.jar /opt/project/k8s-spring-demo-1.2.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/project/k8s-spring-demo-1.2.0.jar"]
