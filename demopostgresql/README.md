---
tags:
- database
- postgresql
---

[[Recherche]]
# MySQL vs PostgreSQL
=================

## With PostgreSQL + Java + Gatling
### Installation
- Java 11 or more
- Maven

### Run
- `mvn spring-boot:run`

### Endpoints available
- Product :
  - [GET all products](http://localhost:8081/products) 
  - [GET by id](http://localhost:8081/products/{id})
- Client :
  - [GET all clients](http://localhost:8081/clients)
  - [GET by id](http://localhost:8081/clients/{id})

### Database
#### Localhost
- [Docker-compose file](docker-compose.yml)

#### Online
- 1 GB / 10 GB Disk / FRANK1 - PostgreSQL 13

### Scala test
- Install Scala [scala-sdk-3.1.0](https://www.scala-lang.org/download/scala3.html)
- Run the docker database service
- Run the server with `mvn spring-boot:run`
- Execute the test :
  - Run [the Engine class](src/test/scala/Engine.scala) with scala
  - Give your test a description inside the terminal

The full result can be found inside the [gatling target index file](target/gatling/testapisimulation-.../index.html)