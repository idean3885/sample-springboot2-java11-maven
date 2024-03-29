FROM amazoncorretto:11-alpine3.18

WORKDIR /app

COPY . .
RUN ./mvnw clean install

ENTRYPOINT java -jar target/*.jar