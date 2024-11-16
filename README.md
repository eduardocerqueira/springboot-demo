# Spring Boot REST Web Application

## Requirements
- Java 17+
- Maven

## How to Run
1. Clone the repository.
2. Encode passwords using `BCryptPasswordEncoder` and update `users.txt`.
3. Run the following commands:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
4. Access the application at `http://localhost:8080`.

## Endpoints
- `/login` - Login page
- `/home` - Home page after login
- `/logout` - Log out and redirect to login page


# Password Encryptor utility

if application is running you can use http://localhost:8080/encrypt-password?password=mypassword123

otherwise running in cmd line:

```
mvn exec:java -Dexec.mainClass="com.example.demo.PasswordEncryptor"
or
java -cp target/classes:target/dependency/* com.example.demo.PasswordEncryptor
```


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.5/maven-plugin/build-image.html)
* [Spring Security](https://docs.spring.io/spring-boot/3.3.5/reference/web/spring-security.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.3.5/reference/actuator/index.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.3.5/reference/using/devtools.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.3.5/reference/features/dev-services.html#features.dev-services.docker-compose)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

