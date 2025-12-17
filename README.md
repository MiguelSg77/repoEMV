# EMV - Entorno Mínimo Viable Java con Docker Compose

Este proyecto proporciona un entorno de desarrollo mínimo viable para aplicaciones Java,
utilizando Docker Compose. El entorno incluye una aplicación Java basada en OpenJDK y una
base de datos PostgreSQL.

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