# k8s-spring-demo
This is a spring on k8s application.

# build and upload image
docker build -t k8s-spring-demo:<version> .
docker tag <image-id> <user>/k8s-spring-demo:<version>
docker push <user>/k8s-spring-demo:<tag>

# export & import an image.
docker save -o k8s-spring-demo-<version>.tar k8s-spring-demo:<version>
docker load < k8s-spring-demo-<version>.tar

# release log
v1.0.0:
I. Containerize
II. A sample spring boot controller.

v1.1.0:
I. Try to use spring boot thymeleaf framework.

v1.2.0:
support postgres db.
