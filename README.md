Install docker

Build jar with:
    mvn clean install

Build image with:
    docker build -f Dockerfile -t docker-spring-boot .

Run container with:
    docker run -p 8085:8085 docker-spring-boot

See effect on Windows:
    1. Get ip of docker:
        docker-machine ip
    2. Open browser and write:
        ip:8085