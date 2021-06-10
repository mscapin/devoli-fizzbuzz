FROM gradle:7.0.2-jdk11 as builder
RUN mkdir /fizzbuzz
COPY . /fizzbuzz
WORKDIR /fizzbuzz
RUN gradle clean build

FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine
RUN mkdir /app
COPY --from=builder /fizzbuzz/build/libs/fizzbuzz-1.0.0.jar /app/fizzbuzz-1.0.0.jar
WORKDIR /app
CMD "java" "-jar" "fizzbuzz-1.0.0.jar"