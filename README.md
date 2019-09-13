# Spring-Boot-Demo-3
Spring Boot CURD Operations

## System Configuration

- Spring Tool Suite 3.9.9
- jre1.8.0_191
- apache-tomcat-8.5.43
- POSTMAN

## Dependency

#### Added when creating the project (Spring Starter Project)
- `Spring Web`
- `Spring Data JPA`
- `Apache Derby Database` [ Database ]


## Instructions to build Project

- Create a Spring Starter Project with the dependencies mentioned above

[Optional]
- edit application.properties in `src\resources` with content
  `servlet:port=8081` in case server tomcat server port isn't working
- create following classes in package `com.demo.sample` and update with given codes.
  
  -  `StateRepository.java`
  -  `States.java`
  -  `StateService.java`
  -  `WebController.java`
  
  
- Run as Java Application


## For POSTMAN (for Testing)
NB: Set HEADER property `Content-Type` : `application/json`

 | Method| Function | URL | Body |
 |:--------:|:---------:|:------:|:---:|
 | GET | To retrive all the values | [localhost:8081/states](http://localhost:8081/states) |No|
 | POST | To add new values | [localhost:8081/states](http://localhost:8081/states)|Yes|
 | PUT | To update values | [localhost:8081/states/{id}](http://localhost:8081/states/101)|Yes|
 | DELETE | To delete value | [localhost:8081/states/{id}](http://localhost:8081/states/101)|No|






