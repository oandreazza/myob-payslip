FROM openjdk:alpine 

RUN apk add apache-ant --update-cache --repository http://dl-4.alpinelinux.org/alpine/edge/testing/ --allow-untrusted

COPY ./ src/myob

WORKDIR src/myob

RUN ant

CMD java -jar build/jar/Myob.jar
