# EMV - Entorno Mínimo Viable Java con Docker Compose

Este proyecto proporciona un entorno de desarrollo mínimo viable para aplicaciones Java,
utilizando Docker Compose. El entorno incluye una aplicación Java basada en OpenJDK y una
base de datos PostgreSQL.

## Promt Óptimo para la IA (ChatGPT)

Genera un archivo docker-compose.yml para un entorno de desarrollo mínimo viable en Java.

El entorno debe incluir:
- Un servicio de aplicación Java usando OpenJDK versión 17
- Un servicio de base de datos PostgreSQL versión 15

Requisitos:
- La aplicación Java debe exponer el puerto 8080
- PostgreSQL debe usar las variables de entorno:
  POSTGRES_USER=admin
  POSTGRES_PASSWORD=admin
  POSTGRES_DB=emvdb
- La base de datos debe usar un volumen para persistencia
- La aplicación debe montar el código Java local en el contenedor
- Ambos servicios deben comunicarse por red interna de Docker
- Usar una versión estable de Docker Compose

El archivo debe ser claro, bien estructurado y listo para usar.

## Requisitos previos

- Docker
- Docker Compose

## Estructura del proyecto

.
├── docker-compose.yml
├── app/
│ └── app.jar
└── README.md


## Configuración inicial

La configuración se encuentra definida directamente en el archivo `docker-compose.yml`.
No es necesario modificar variables de entorno para un uso básico.

## Puesta en marcha

Para iniciar el entorno:

```bash
docker-compose up -d

Para detenerlo:

docker-compose down
```

## Prueba

Deberá salir algo así:

```bash
emv_java_app  | ✅ Conexión a PostgreSQL establecida
emv_java_app  | ID: 1 | Name: Hola EMV
emv_java_app exited with code 0
```

Se habrá realizado la conexión correctamente
