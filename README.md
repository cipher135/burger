# burger
# Burger app(using Maven, Spring &amp; Java) is simple display of how to build a REST API &amp; read data from MySql DB using spring-data-jpa


# dependecies add while creating project on https://start.spring.io/

# Spring Web (WEB, spring-boot-starter-web)
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

# Spring Data JPA (SQL, spring-boot-starter-data-jpa)
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

# MySQL Driver (SQL, mysql-connector-j)
MySQL JDBC driver.

# @Controller was giving the following error
Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer'; For input string: "john"]
and hence BAD_REQUEST in Postman. So,

# changed @Controller → @RestController
@RestController is a composed annotation that is itself meta-annotated with @Controller and @ResponseBody indicating a controller whose every method inherits the type-level @ResponseBody annotation and therefore writes directly to the response body vs view resolution and rendering with an HTML template.

# org.slf4j is provided by Spring itself

# use jakarta.persistence for spring > 2.7, javax.persistence is used for spring <= 2.7. otherewise, it will give error creating bean
