# k8s-spring-demo
This is a spring on k8s application.

# build and upload image
docker build -t k8s-spring-demo:<version> .
docker tag <image-id> <user>/k8s-spring-demo:<version>
docker push <user>/k8s-spring-demo:<tag>

# release log
v1.0.0:
I. Containerize
II. A sample spring boot controller.
