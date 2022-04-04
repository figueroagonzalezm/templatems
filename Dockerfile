FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.10_9_openj9-0.24.0
ENV STAGE_NAME certification
WORKDIR /usr/app
COPY build/libs/templatems-1.0.0-SNAPSHOT.jar .
COPY extras/newrelic/ newrelic/
CMD java -javaagent:newrelic/newrelic.jar -Dnewrelic.environment=$STAGE_NAME -Xms1536m -Xmx1536m -jar -Dhttps.protocols=TLSv1.2 templatems-1.0.0-SNAPSHOT.jar
