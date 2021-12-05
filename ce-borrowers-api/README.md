## \[Fines Académicos\] Microservicio de Clientes

### Resumen
API implementada en Java + SpringBoot + Spring WebMVC, responsable de administrar los detalles de los deudores en la base de datosde deudores construida sobre MariaDB.

### Especificación

#### Obtener Detalles Deudor
Operación encargada de obtener los detalles de un deudor dado su tipo y número de identificación.

**Método HTTP:**
GET

**Endpoint:**
http://localhost:8080/borrowers-api/borrowers?tipoId=1&identificacion=1234567

**Petición de ejemplo:**

|Parámetro Query|Valor|
|---|---|
|tipoId|1|
|identificacion|1234567|


**Respuesta de ejemplo:**
```
{
  "data": [
    {
      "label": "TIPO_CLIENTE",
      "value": "MULTIPRODUCTO"
    }
  ]
}
```