## \[Fines Académicos\] CE Apps

### Resumen
Componentes que soportan la cobranza estratégica con base en técnicas de Machine Learning.

### Requerimientos
Ejecutar las aplicaciones en ambiente local requiere tener instalada la versión más reciente de [Docker](https://www.docker.com/products/docker-desktop).

### Arquitectura

![](./docs/CE_ARCHITECTURE.png)

### Componentes

|Componente|Descripción|Tecnologías Principales|
|---|---|---|
|CE API|RESTful API encargada de exponer las predicciones de los modelos para el consumo de la WebUI.|Python, Flask-RESTful|
|Borrowers API|RESTful API  responsable de administrar los detalles de los deudores en la base de datos de deudores construida sobre MariaDB.|Java 8, SpringBoot, Spring WebMVC|
|CE UI|WebUI encargada de facilitar la interacción de los agentes finales con las predicciones para el desarrollo de sus funciones.|ReactJs|

### Quickstart
Para ejecutar los dos componentes localmente, ejecutar el siguiente comando:

```
docker-compose up --build
```

Para documentación sobre los recursos disponibles a través de la API: [CE API](./ce-api)
Para documentación sobre la WebUI: [CE UI](./ce-ui)