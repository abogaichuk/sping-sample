### Run in docker
```
java -Djarmode=layertools -jar target/springPatterns-1.0.jar list
docker build -t spring-patterns .
docker run -it -p8080:8080 springPatterns:latest
```
