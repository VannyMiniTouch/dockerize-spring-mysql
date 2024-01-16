@echo off
echo __________________ Start Running... __________________
echo Run Maven clean and build file jar
call mvn clean install -DskipTests
echo Shutdown and remove docker container
call docker-compose down
echo Remove docker spring image
call docker image rm dockerize-springboot-mysql-app
echo Running docker-compose
call docker-compose up
echo All commands executed successfully
