FROM java:openjdk-8u72-jdk

RUN mkdir -p /root/bin
RUN curl -s https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt > ~/bin/sbt && chmod 0755 ~/bin/sbt
ENV PATH $PATH:/root/bin
RUN sbt -sbt-create
RUN sbt -sbt-version 0.13.11

RUN mkdir -p /tmp/app
WORKDIR /tmp/app
RUN sbt -sbt-create
COPY app /tmp/app/
RUN sbt clean test:compile
RUN rm -r /tmp/app
