Aplicación completa de JSB

## GitHub util commands
    * Git status
    * Git add .
    * Git commit -m ""
    * Git push origin master
    
    * Git remove remote origin master
    * Git remote add origin  https://github.com/julianfv1150/siteFull.git

----------------
    When initiate work on other device we need clone the REPO, navegate to the directory, in, change the branch and now execute 'git pull origin'. The project will be updated.

## Dependencies Injection JSB
    -> Spring JPA
    -> Spring MongDB
    -> Spring Oauth2
    -> Spring Security
    -> Spring Thymeleaf
    -> Spring Web
    -> Spring Thymeleaf extras
    -> Spring Framewort Test
    -> Spring Security Test
    -> Spring Springfox Swagger 3.0
    -> Spring DevTools

## Functionalities & schema
(BASED ON MAVEN)    

-->Functionalities
-->Schema
Based in directories separated by types (Clases and Intefaces)

First:
Documents directory is created for percistence collections, a class generate the schema for data can by storage in MongoDB monitored with Compass.
The class named Usuarios, directly related with @Document(Spring Documentation) for MongoDB.mapping

Second:
Repositories directory is created for interface will retrive data

Third:
Controllers directory storage endpoints URI API's

## Security
(security password: 3ba18cc7-29b8-4557-94a2-97c7643e7435)