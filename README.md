# Spring Boot RESTful API de Productos

Este proyecto es una API RESTful completa desarrollada con Spring Boot y Java que demuestra buenas prácticas y conceptos importantes en el desarrollo de aplicaciones empresariales.

## Características

- Arquitectura en capas (Controller, Service, Repository)
- CRUD completo con Spring Data JPA
- Validaciones con Bean Validation
- Manejo de excepciones global
- Operaciones HTTP (GET, POST, PUT, PATCH, DELETE)
- Base de datos H2 en memoria con datos iniciales
- Documentación clara y completa

## Tecnologías utilizadas

- Java 17
- Spring Boot 3.2.1
- Spring Data JPA
- H2 Database
- Spring Validation
- Maven

## Estructura del proyecto

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── demo
│   │               ├── DemoApplication.java
│   │               ├── controller
│   │               │   └── ProductController.java
│   │               ├── exception
│   │               │   ├── GlobalExceptionHandler.java
│   │               │   └── ResourceNotFoundException.java
│   │               ├── model
│   │               │   └── Product.java
│   │               ├── repository
│   │               │   └── ProductRepository.java
│   │               └── service
│   │                   ├── ProductService.java
│   │                   └── ProductServiceImpl.java
│   └── resources
│       ├── application.properties
│       └── data.sql
```

## Cómo ejecutar

1. Clona este repositorio
2. Navega al directorio del proyecto
3. Ejecuta `mvn spring-boot:run`
4. La aplicación estará disponible en http://localhost:8080

## Endpoints API

- `GET /api/products` - Obtener todos los productos
- `GET /api/products/{id}` - Obtener un producto por ID
- `POST /api/products` - Crear un nuevo producto
- `PUT /api/products/{id}` - Actualizar un producto existente
- `PATCH /api/products/{id}` - Actualizar parcialmente un producto
- `DELETE /api/products/{id}` - Eliminar un producto
- `GET /api/products/category/{category}` - Filtrar productos por categoría
- `GET /api/products/search?name={name}` - Buscar productos por nombre
- `GET /api/products/price-range?min={min}&max={max}` - Filtrar por rango de precios
- `GET /api/products/low-stock` - Obtener productos con bajo stock

## Consola H2

La consola de H2 está habilitada y accesible en http://localhost:8080/h2-console:
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## Contribuir

Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.
