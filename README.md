# QuotesBackend
A RESTful backend for the daily quotes project. This application is built with spring boot and probably sucks.

# Usage

1. Checkout the latest version of the repository - 

```bash
    git checkout https://github.com/PaulDavidTucker/QuotesBackend.git
    
    cd QuotesBackend
```
2. Do a clean install to check application can load

```bash
    mvn clean install
    
    #To ignore tests
    mvn clean install -DskipTests
```

3. Run the application from QuotesBackendApplication, or run from the command line

```bash
    mvn spring-boot:run
```

Now that the application is running, navigate to localhost:8080

Here is a table of all available endpoints, ready for use within the project.

| Endpoint                               | Usage                                                                               |
|----------------------------------------|-------------------------------------------------------------------------------------|
| [GET] localhost:8080/api/users         | Retrieval of all users from the DB. Content returned as a Java list                 |
| [POST] localhost:8080/api/users        | Creation of a new user. Request body must be of a new user object.                  |
| [GET] localhost:8080/api/users/{ID}    | Retrieval of a user by specific ID. ID must be an integer.                          |
| [PUT] localhost:8080/api/users/{ID}    | Modify values of a user by ID. A users object must be supplied in the request body. |
| [DELETE] localhost:8080/api/users/{ID} | Delete the user specified by ID. Takes an integer as the ID.                        |

# Tests

To run unit tests simply have the application running and use this command:

```bash
    mvn test
```


