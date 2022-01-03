---
tags:
- database
- mysql
---

[[Recherche]]
# MySQL vs PostgreSQL
=================

## With MySQL + Java + Gatling
### Installation
- Java 11 or more
- Maven

### Run
- `mvn spring-boot:run`

### Endpoints available
- Product :
    - [GET all products](http://localhost:8080/products)
    - [GET by id](http://localhost:8080/products/{id})
- Client :
    - [GET all products](http://localhost:8080/clients)
    - [GET by id](http://localhost:8080/clients/{id})

### Database
### Localhost
- [Docker-compose file](docker-compose.yml)

### Online
- 1 GB / 10 GB Disk / FRANK1 - MySQL 8
