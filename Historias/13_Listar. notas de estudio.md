# Historia: Publicacion de Item.

- Yo como: Usuario estudiante
- Quiero: Poder registrar una lista de materias de mi grado con mis notas semestrales.
. Para: Poder recibir una ayuda.


## Especificación de requerimientos.

1. La cantidad maxima o minima de materias.
2. Al momento de registrar las materias se debe informar al usuario.
3. Las materias se deben registrar juntamente con su nota.
4. Se deben enviar las notas a proceso de validacion.

## Analisis

### Pantalla de lista de materias

A continuación se presenta la pantalla de subida, cuyo funcionamiento es.

1. El usuario hizo clic en el boton de añadir.
2. El usuario deberá tener lista las notas

![Alt text](gradoyNota.png)

### Pantalla de subida de notas


### Validacion de cantidad de imagenes

- Dado: Que el usuario registro el grado
- Cuando: Este por guardar la materias con notas
- Entonces: El sistema debe validar que subio al menos 2 y máximo 13.

## Disenio

Deberia mostrar un mensaje de se guardo con exito las materias.
### Pantalla de registro de notas

1. Para buscar el coddigo de la carta:

Request:
```
POST BASE_URL/api/estudiante/notas_grados
Accept: Application/json
Authorization: Bearer JWT
```

Response: Exitoso statusCode: 200
```
{


}
```

Response: No encontrado statusCode: 404
```

```



