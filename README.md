# ProyectoGimnasioJava
Repositorio base para actividad práctica con GitHub y Java

# Gimnasio en Java
Este repositorio contiene una clase base para gestionar actividades en un gimnasio. Deben realizar un fork y mejorar el proyecto.

## Descripción de las mejoras
1. Separar en archivos diferentes la clase gimnasio y la clase main y cambiar el nombre de la variable nombre por nombregym en la clase Gimnasio.
2. Creación de la clase padre Actividad, que será la base de todas las actividades que tenga el gimnasio.
3. Creación de las variables nombre, intensidad y duración, así como de sus getters y setters, y, la funcion mostrarInfo que servirá para que en cada clase se le pueda asignar un nombre, intensidad y duración a cada actividad con la misma función.
4. Creación de las clases Boxeo, Yoga y Funcional. En cada clase se hereda la clase actividad y se adapta la funcion mostrarInfo.
## Justificación de los cambios
1. Separé los archivos para mejorar la estructura, dividir los archivos por clase con una clase principal a través de la cual se puede operar con todas las demás clases.
2. Creé la clase actividad para no tener que escribir código de más por cada una de las actividades (yoga, boxeo, funcional y mas clases si se quisieran añadir) y que sea mas modular.
3. Creé las variables con los getters y setters y el método mostrarInfo que será reutilizado por todas las clases para mostrar los datos de cada clase
4. Creé las clases hijas (boxeo, yoga y funcional) para poder aplicar lo hecho en la clase Actividad
## Uso de los cambios
Para poder usar los cambios realizados, en el main, podemos instanciar la clase Gimnasio (la cual ya estaba previamente) y la clase base Actividad junto con la clase yoga, boxeo o funcional. A dichas clases hay que pasarle por parámetro la intensidad y duración de la actividad, y, para mostrar los datos, llamamos a la variable con el método mostrarInfo.

