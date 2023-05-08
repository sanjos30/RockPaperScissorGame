#Build stage

FROM gradle:8-jdk8 AS BUILD

WORKDIR /usr/app/
COPY . .
RUN gradle clean
RUN gradle build
RUN pwd
RUN ls -lrt
# Package stage

FROM adoptopenjdk/openjdk8
ENV JAR_NAME=PaperScissorsRockApp.jar
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8080

RUN chmod +x entryPoint.sh
#ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME
ENTRYPOINT ["./entryPoint.sh"]
