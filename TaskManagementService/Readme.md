
# Step-By-Step Tutorial for Building a REST API in Java

mvn clean package
./target/bin/taskmanagement_webapp

// http://localhost:8080/TaskManagementService_war/api/tasks

Guice dependency injection framework
Jersey использует HK2 в качестве фреймворка для внедрения зависимостей
По умолчанию Jersey будет полагаться на HK2 для создания класса
нужно сообщить Jersey об инжекторе Guice.
Для соединения Guice и HK2 мы используем так называемый мост Guice/HK2.

### Dockers
```
docker build --tag task-management-service .
docker run -d -p 127.0.0.1:8080:8080 --name test-task-management-service task-management-service
```

```
docker start/stop test-task-management-service
```









 Jersey 2.26