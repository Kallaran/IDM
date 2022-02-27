FROM openjdk:11-jre-slim
COPY ./target/python.jar /app/python.jar
COPY ./target/execute.sh /app/execute.sh
COPY ./MYDSL_programs/ /app/progs/
COPY ./target/villes.csv /app/villes.csv
WORKDIR /app
RUN mkdir src-gen \
    && apt-get update \
    && apt-get install -y python3 \
    && apt-get install -y pip \
    && pip install pandas 

ENTRYPOINT [ "bash", "execute.sh"] 
