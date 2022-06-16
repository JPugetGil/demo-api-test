---
tags:
- database
- mysql
- postgresql
---

[[Recherche]]
# MySQL vs PostgreSQL
=================

## The Project
### PostgreSQL

#### Run
- `mvn spring-boot:run`

#### Endpoints available
- Product :
    - [GET all products](http://localhost:8080/products)
    - [GET by id](http://localhost:8080/products/{id})
- Client :
    - [GET all clients](http://localhost:8080/clients)
    - [GET by id](http://localhost:8080/clients/{id})

#### Database
##### Localhost
- [Docker-compose file](./docker-compose.yml)

##### Digital Ocean
- 1 GB RAM / 1vCPU / 10 GB Disk / FRA1 - PostgreSQL 14

#### Scala test
- Install Scala [scala-sdk-3.1.0](https://www.scala-lang.org/download/scala3.html)
- Run the docker database service
- Run the server with `mvn spring-boot:run`
- Execute the tests with `mvn gatling:test`

The full result can be found inside the [gatling target index file](target/gatling/testapisimulation-.../index.html)


### MySQL

#### Run
- `mvn spring-boot:run`

#### Endpoints available
- Product :
    - [GET all products](http://localhost:8080/products)
    - [GET by id](http://localhost:8080/products/{id})
- Client :
    - [GET all clients](http://localhost:8080/clients)
    - [GET by id](http://localhost:8080/clients/{id})

#### Database
##### Localhost
- [Docker-compose file](./docker-compose.yml)

##### Digital Ocean
- 1 GB RAM / 1vCPU / 10 GB Disk / FRA1 - MySQL 8

#### Scala test
- Install Scala [scala-sdk-3.1.0](https://www.scala-lang.org/download/scala3.html)
- Run the docker database service
- Run the server with `mvn spring-boot:run`
- Execute the tests with `mvn gatling:test`

The full result can be found inside the [gatling target index file](target/gatling/testapisimulation-.../index.html)
