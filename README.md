# 🛒 Gestión de Productos

Proyecto web desarrollado con **Spring Boot**, **Thymeleaf** y **MySQL** que permite
gestionar productos mediante las operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

---

## 🚀 Características

- Crear nuevos productos con validaciones
- Listar todos los productos registrados
- Editar la información de productos existentes
- Eliminar productos del inventario
- Validaciones automáticas con `jakarta.validation`
- Plantillas HTML con Thymeleaf + Bootstrap 5
- Persistencia de datos con Spring Data JPA y MySQL

---

## 🧱 Tecnologías utilizadas

| Herramienta          | Versión       |
|----------------------|---------------|
| Java                 | 17            |
| Spring Boot          | 3.5.4         |
| Spring Data JPA      | 3.5.4         |
| Thymeleaf            | 3.1.3.RELEASE |
| MySQL                | 8.0.33        |
| Bootstrap            | 5.3           |

---

## ⚙️ Configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/gestion-productos.git
cd gestion-productos
````

### 2. Configurar la base de datos

Crea una base de datos en MySQL:

```sql
CREATE DATABASE gestion_productos;
```

En el archivo `src/main/resources/application.properties`, asegúrate de tener:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_productos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

### 3. Ejecutar el proyecto

Desde tu IDE o consola:

```bash
./mvnw spring-boot:run
```

Accede en tu navegador a:

```
http://localhost:8080/productos
```

---

## 🧪 Pruebas y validaciones

* Todos los campos del formulario tienen validaciones (campos requeridos, valores positivos).
* Si se ingresan datos inválidos, se muestran mensajes de error personalizados.
* Se realizaron pruebas manuales para cada historia de usuario.

---

## 👤 Autor

**Gabriel Burgos**,
**Kevin Quiñones**
Proyecto desarrollado como parte de la evidencia **GA7-220501096-AA3-EV02** del SENA.
