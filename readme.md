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
     
     `{
        "username" : "teste@teste.com",
         "password":"teste"
     }`  