---
tags:
- database
- data
- generator
---

[[Recherche]]
# MySQL vs PostgreSQL
=================

## Data generator
### Installation
- Java 11 or more
- Maven

### Run
- `mvn spring-boot:run`

### Use
`{number}` must be replaced by the **number of records** you want to insert inside your database
- [product generator link](http://localhost:8082/generate/products/{number})
- [client generator link](http://localhost:8082/generate/clients/{number})
- [fullscript generator link](http://localhost:8082/generate/fullscript/{number})
    - You can now copy the content of the [script file](data.sql) inside your `data.sql` database file project
