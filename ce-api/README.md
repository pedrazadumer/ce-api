## CE API

### Resumen
API implementada en Python + Flask-Restful, responsable de consumir los modelos de ML para realizar las predicciones sobre la probabilidad de recuperación de la deuda, así como el mejor canal de contacto para favorecer la recuperación de la misma.

### Especificación

#### Predicción Sobre la Recuperación
Operación encargada de realizar las predicciones sobre la recuperación de la deuda para los datos presentados.

**Método HTTP:**
POST

**Endpoint:**
http://localhost:5000/loan-recovery/predict

**Petición de ejemplo:**
```
{
    "agentId": 123456,
    "data": [
        "item1",
        "item2",
        "item3"
    ]
}
```

**Respuesta de ejemplo:**
```
{
    "recoveryRate": 0.8456,
    "bestContactChannel": "Email"
}
```