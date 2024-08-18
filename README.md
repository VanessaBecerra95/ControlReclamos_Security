# Control de Reclamos de Transporte

Este proyecto es una aplicación de gestión de reclamos para una empresa de servicios de transporte. La aplicación permite el registro e inicio de sesión de los trabajadores del equipo de soporte telefónico, asegurando que solo los usuarios registrados puedan acceder a la plataforma.

## Características

- **Registro de Usuarios:** Permite a los trabajadores registrarse en la aplicación proporcionando su información personal y una contraseña.
- **Inicio de Sesión:** Los usuarios pueden iniciar sesión utilizando sus credenciales. El sistema valida la autenticidad de los usuarios antes de conceder acceso.
- **Gestión de Roles:** La aplicación gestiona los roles de los usuarios, permitiendo diferentes niveles de acceso basados en sus roles asignados.
- **Navegación:** Implementación de un navbar para facilitar la navegación entre las diferentes rutas de la aplicación.
- **Control de Sesiones:** La lógica para el inicio y cierre de sesión se ha implementado, incluyendo el manejo de mensajes de error cuando un usuario no registrado intenta acceder.

## Requisitos

Para ejecutar este proyecto en tu entorno local, necesitarás tener instalados los siguientes componentes:

- **Java 17** o superior: El proyecto está desarrollado con Spring Boot, que requiere una versión compatible de Java.
- **Maven 3.8** o superior: Para gestionar las dependencias y construir el proyecto.
- **PostgreSQL 13** o superior: Base de datos utilizada para almacenar la información de usuarios y roles.
- **Node.js** (opcional): Para gestionar Tailwind CSS si decides personalizar los estilos.

## Tecnologías Utilizadas

- **Spring Boot:** Marco principal utilizado para el desarrollo de la aplicación.
- **Spring Data JPA:** Utilizado para la persistencia y gestión de datos en la base de datos PostgreSQL.
- **Spring Security:** Implementado para manejar la autenticación y autorización de usuarios.
- **PostgreSQL:** Base de datos relacional utilizada para almacenar la información de los usuarios y roles.
- **Tailwind CSS:** Utilizado para el diseño responsivo de las páginas JSP, como el inicio de sesión y el registro.
- **Thymeleaf:** Motor de plantillas utilizado para renderizar las vistas en la aplicación.
- **Lombok:** Utilizado para reducir el código boilerplate mediante anotaciones como `@Getter`, `@Setter`, y `@ToString`.

## Cómo Ejecutar el Proyecto

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/usuario/controlreclamos_transporte.git
2. Configura la base de datos:
   - Asegúrate de tener PostgreSQL instalado y añadir los datos del script llamado "script sql para la base da datos control reclamos".
   - Configura las credenciales en el archivo application.properties.
4. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
5. Accede a la interfaz web: Una vez que la aplicación esté en ejecución, accede a http://localhost:8080 para interactuar con el sistema.

## Uso

- **Registro de Usuario:** Accede a la ruta `/register` para registrar un nuevo usuario.
- **Inicio de Sesión:** Accede a la ruta `/login` para iniciar sesión con las credenciales registradas.
- **Home:** Después de iniciar sesión, el usuario será redirigido a la página de inicio.
- **Cierre de Sesión:** Los usuarios pueden cerrar sesión desde el navbar.

## Consideraciones

- Se utilizaron las mejores prácticas de desarrollo en Spring Framework, incluyendo la inyección de dependencias y el uso de anotaciones.
- El proyecto fue diseñado para ser escalable y fácil de mantener, aprovechando la modularidad que proporciona Spring Boot.
