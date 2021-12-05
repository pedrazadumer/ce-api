FROM tomcat:8-jdk8-adoptopenjdk-hotspot
RUN echo "export JAVA_OPTS=${JAVA_OPTS} -Xms128m -Xmx1024m -XX:MaxPermSize=256m -server" > /usr/local/tomcat/bin/setenv.sh
COPY target/*.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]