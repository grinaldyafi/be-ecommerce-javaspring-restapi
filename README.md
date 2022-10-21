# RESTful API - Simple Backend Ecommerce menggunakan Java Spring Boot :globe_with_meridians::leaves:

_Bismillah_

## Technologies :computer:

### Language, Framework & Dependency
- Java (jdk)
- Maven
- Spring boot
- Spring Data JPA 
- Spring security (JWT :grey_question:)
- Swagger 
- Lombok
### Database
- PostgreSQL (menggunakan pgAdmin)
### Deployment
- Heroku https://be-ecommerce-javaspringboot.herokuapp.com/
### Container
- Docker Hub https://hub.docker.com/r/yafirasyad/beecommercejavaspringrestapi (perlu perbaikan)
### Testing Tools
- Postman
### Code Editor 
- Visual Studio Code

<br>

## System Design :memo:
- RESTful API Design https://be-ecommerce-javaspringboot.herokuapp.com/swagger-ui/
![image](https://user-images.githubusercontent.com/46275481/196979770-739e5ae2-a216-4060-a15b-179473a2a9d7.png)

- ERD : 
![image](https://user-images.githubusercontent.com/46275481/196974080-de42b5e1-9428-4926-8ab1-ff435405af18.png)
- System Flow: 
![image](https://user-images.githubusercontent.com/46275481/196974178-e28fefb5-316e-4970-8ac2-f8b804029e6c.png)
<br>

## Features :man_technologist:
- CRUD Product (dapat menambahkan,melihat,update/edit,delete list produk) :white_check_mark:
- CRUD Kategori (dapat menambahkan,melihat,update/edit,delete list kategori) :white_check_mark:
- CRUD Pengguna (dapat menambahkan,melihat,update/edit,delete list pengguna) :white_check_mark:
- Customer can add product to shopping cart :grey_question:
- Customers can see a list of products that have been added to the shopping cart :grey_question:
- Customer can delete product list in shopping cart :grey_question:
- Customers can checkout and make payment transactions :grey_question:
- Login and register customers :grey_question:

<br>

## How to use (cara menggunakan secara Lokal) :hammer_and_wrench:	
### Syarat:
- Minimal menggunakan Java 8, JDK, Maven.
### Step
1. Clone repository
```bash
$ git clone https://github.com/grinaldyafi/be-ecommerce-javaspring-restapi.git
```
2. Buka menggunakan VSCode atau IntelliJ IDEA
3. Buat database PostgreSQL dengan nama **ecommerce** 
   > atau dapat diubah secara custom di ```src/main/resources/application.properties```
4. ketik pada terminal ```mvn spring-boot:run```
   > untuk menjalankan server dan menggunakan restapi secara lokal
5. Endpoint 'http://localhost:8080/' dimana port dapat diubah pada ```src/main/resources/application.properties```
   > endpoint tersebut berjalan secara lokal untuk dapat digunakan testing restapi menggunakan postman.
6. Have fun! 
<br>

## Testing RESTful API :test_tube:
   Dokumentasi API pada proyek ini menggunakan Swagger https://swagger.io/ yang dapat diakses di https://be-ecommerce-javaspringboot.herokuapp.com/swagger-ui/
   
### Testing API tanpa clone
#### Step
1. Buka postman dan ketik pada request url 'https://be-ecommerce-javaspringboot.herokuapp.com/'
2. atur sesuai kebutuhan (GET,POST,PUT,DELETE)
3. Contoh endpoint, body dll. dapat dilihat di 'https://be-ecommerce-javaspringboot.herokuapp.com/swagger-ui/'
- Contoh:
![image](https://user-images.githubusercontent.com/46275481/196953688-5faf84a9-cc3c-4502-bf95-2cac24678a9a.png)

### Menggunakan API dengan melakukan clone
1. Buka postman dan ketik pada request url 'http://localhost:8080/'
2. atur sesuai kebutuhan (GET,POST,PUT,DELETE)
3. Contoh endpoint, body dll. dapat dilihat di https://be-ecommerce-javaspringboot.herokuapp.com/swagger-ui/
- Contoh:
![image](https://user-images.githubusercontent.com/46275481/196954320-c3194820-8b19-4c33-a039-fae96eee0ceb.png)

<br>

## Referensi :books:
1. Konsep Docker: https://www.youtube.com/watch?v=3_yxVjV88Zk&t=1870s
2. Springboot Docker: https://www.youtube.com/watch?v=qXoaJapIqxc&t=963s
3. Ecommerce restapi: https://github.com/rene-kt/spring-restapi-ecommerce | https://github.com/andiksystem/tutorial-ecommerce | https://github.com/webtutsplus/ecommerce-backend | https://www.youtube.com/watch?v=MgOJmWMSTuQ&list=PLzXSm2gSfuPJtCgYJRJdB2hpP3gz73Dvc 
4. Deploy springboot+postgresql: https://www.youtube.com/watch?v=iJ2rkonD6V4
6. Golang ecommerce + system design: https://www.youtube.com/watch?v=7hOfR6wHMaw&t=614s
7. Swagger Integration for API Documentation: https://www.youtube.com/watch?v=BWGRPgAQD9A
8. Database design: https://www.youtube.com/watch?v=25xRI6MHyv4&list=PLUCD-6cu16lIXEXqjft6dwphnehZ_ukAv
9. Architecture & pattern inspiration: https://dev.to/nilmadhabmondal/lets-develop-an-e-commerce-application-from-scratch-using-java-and-spring-28go

PS: not finished yet, need guidance(mentor), time and expereience to learn. Bismillah.
<br> <br>
Built With :heart: by Grinaldy Yafi' Rasyad | Yogyakarta, Indonesia
