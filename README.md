# GraphQL Demo Project

## Prerequisites

1. JDK 8
2. Maven 3.x
3. This project is written in Kotlin. You have to enable the kotlin plugin in your ide.

## Getting started

###  Start the project within your ide.

### Start the project on cli

    $ make build
    $ make start
    
## Examples

In this project there are two types of entities:
1. A single entity `Book`
2. A entity with a many to one relationship `Person` and `Relationship`

### How to use

After startup the server provides the following endpoints:

1.  http://localhost:8080/graphiql  (UI to test graphql)
2.  http://localhost:8080/graphql   (Endpoint to communicate with graphql)
