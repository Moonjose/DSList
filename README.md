# DSList

# About

DSList is a REST API built during the Javaspring intensive, an event organized by [DevSuperior](https://devsuperior.com "DevSuperior site").

The API consists of a list of games with data such as name, year of release, description, image, etc.

## Domain model
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Endpoints

|Endpoints                              | Usage                                 | Params                                      |
|---------------------                  | --------------------------            | ------------------------------------------- |
|`GET  /games`                      | Get all of the games                  |  -------------------------------------------|
|`GET  /games/:id`                 | Get a game by id           | **id**: [Number]                            | 
|`GET  /lists`                      | Get all lists                         | -------------------------------------------|
|`GET  /lists/:id/games`         | Get all games by list id              | **id**: [Number]                            |
|`POST /lists/:id/replacement` | Move a game to other list position    | **id**: [Number]                             |

# Stack
## Back end
- Java
- Spring Boot
- JPA
- Maven

## Production Environment
- Deploy: Railway
- Database: Postgresql

## Local Environment
- Database H2
- Docker

# Author

Jodev

https://www.linkedin.com/in/jodvs/


