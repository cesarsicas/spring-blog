# Spring Blog Backend

Simple Blog API, made with Spring Boot and Java. Includes Site and admin area with login. 
Also, check the React client for this api https://github.com/cesarsicas/react-blog

### Technologies used on this project
  - Spring Boot (Data, Web, Actuator and Security Modules)
  - MySQL
  - JWT 
 
### Endpoints
  - /posts/list [GET]
  - /posts/{id} [GET]
  - /posts/comments/list [GET]
  - /posts/{postId}/comments [POST]  


  - /admin/posts [GET] *
  - /admin/posts/{id} [GET] *
  - /admin/posts [POST] *
  - /admin/posts/{id} [DELETE] *
  
    Endpoints with * require Bearer Token. 
    The token is generated doing a request to **/login** with following

```     
     {
        "username" : "teste@teste.com",
         "password":"teste"
     }
```  
     
### How To test this project
  - Clone the repo on your machine. You will need to install Java and Java SDK. 
  - Choose and compatible IDE (Recommended Intellij IDEA Ultimate Edition)
  - Import the Maven Project and install dependencies
  - Install MySQL and create a database for the project called "blogdb"
  - Create a config file called "application.properties" on /src/resources, with the following content:
  
```
   spring.datasource.url=jdbc:mysql://localhost:3306/blogdb?createDatabaseIfNotExists=true&useSSL=false&serverTimezone=UTC
   spring.datasource.username=[your database username with root privillegies]
   spring.datasource.password=[your database password]
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   
   spring.jpa.show-sql=true
   spring.jpa.open-in-view=true
   
   spring.jpa.hibernate.ddl-auto=create-drop
   spring.datasource.initialization-mode=always
   spring.datasourse.data=import.sql`
```  
  