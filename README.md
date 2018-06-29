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
2. A entity with a many to one relationship `User` with `Address`

### How to use

After startup the server provides the following endpoints:

1.  http://localhost:8080/graphiql  (UI to test graphql)
2.  http://localhost:8080/graphql   (Endpoint to communicate with graphql)

#### Query Examples

List off books:

    { 
      books {
        id
        title
        author
      }
    }
    
Result:

    {
         "data": {
           "books": [
             {
               "id": 1,
               "title": "Learn about graphql",
               "author": "Ich halt"
             },
             {
               "id": 2,
               "title": "Master Graphql",
               "author": "Du auch"
             }
           ]
         }
       }
Book by Id:

    { 
         getBookById(id:1) {
           id
           title
           author
         }
       }
Result:

    {
      "data": {
        "getBookById": {
          "id": 1,
          "title": "Learn about graphql",
          "author": "Ich halt"
        }
      }
    }
    
List of Users:

    { 
      users {
        id
        firstName
        lastName
        email
        addresses {
          id
          street
          houseNr
          zipCode
          city
        }
      }
    }
    
 Result:
 
    {
      "data": {
        "users": [
          {
            "id": 1,
            "firstName": "Max",
            "lastName": "Mustermann",
            "email": "max.mustermann@web.de",
            "addresses": [
              {
                "id": 1,
                "street": "Schwabacherstr",
                "houseNr": "106",
                "zipCode": 90482,
                "city": "Fuerth"
              },
              {
                "id": 2,
                "street": "Buergweg",
                "houseNr": "10A",
                "zipCode": 90482,
                "city": "Nuernberg"
              }
            ]
          },
          {
            "id": 2,
            "firstName": "Heike",
            "lastName": "Musterfrau",
            "email": "heike.musterfrau@web.de",
            "addresses": [
              {
                "id": 3,
                "street": "Hauptstr",
                "houseNr": "1",
                "zipCode": 80802,
                "city": "Dort"
              }
            ]
          }
        ]
      }
    }
    
## Todos

1. Analyse mutations