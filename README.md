# 1. Act1. Introducción a Spring Boot.
## Se configuro mi entorno de desarrollo para Java y Spring Boot, creé mi primer proyecto desde Spring Initializr, desarrollé mis primeros controladores para atender peticiones web, y lo desplegue corriendo en el VPS y en mi equipo.
***
#### Elaborado por: David Efraín José Ramos NL 19
***
### Preguntas de la fase tres:
##### a) ¿Qué es un @Controller o @RestController en Spring Boot, y qué diferencia hay entre ambos?
El @Controller le indica al sistema que es una clase de tipo controlador. Un controlador se define usando algo que se conoce como anotaciones también va a manejar las rutas mediante algo llamado request mapping que es el método con que el controlador va a manejar esas solicitudes entonces recibe los datos de las solicitudes http y lo hace capturando los datos desde una URL que sería el cuerpo de esa solicitud y luego le devuelve una respuesta al elemento que hace la solicitud y esta respuesta que manda ese controlador puede ser un archivo de tipo json o xml o tratándose de página web html eso va  depender de los requisitos de eh Y la configuración que hagamos.

Un @RestController es una anotación que se utiliza para definir un controlador que maneja solicitudes http y que produce respuestas directamente pero en formato JSON o XML.

Ejemplo del video:

```java
    import org.springframework.stereotype.Controller;
    @Controller
```
```java
import org.springframework.web.bind.annotation.RestController;
@RestController //método handler REST
```

##### b) ¿Qué anotación se usa para mapear una petición GET a un método, y cómo se le indica la ruta (endpoint)?
Para mapear una petición GET a un método se utiliza la anotación "@GetMapping" y para indicar la ruta (endpoint) se especifica la URL deseada entre comillas dentro de los paréntesis de la anotación.

Ejemplo del video:

```java
    @GetMapping("/detalles_info")
```

###### c) ¿Qué puerto usaste en tu VPS y por qué tuviste que definirlo manualmente en vez de dejar el que viene por defecto?
En el local use el puerto 8080, pero supongo que en VPS se tiene que cambiar porque vamos a crear diversos proyectos. En el video tuvieron un problema al correr su programa porque el puerto '8080' estaba ocupado. Es facil cambiarlo desde 'aplication.properties'.

Ejemplo: 

```java 
    server.port = 8080
```
En mi puerto use el 8081 y lo tuve que definir manualmente desde 'aplication.properties' porque mi compañero usara el 8082, ya que el 8080 suele usarse por defecto en pruebas locales.

##### d) Pega el enlace de tu repositorio de GitHub, y el link de tu proyecto ya corriendo en el VPS.

Link de repositorio: https://github.com/David-Ramos1010/DEJRact1_t4

Links del VPS:
http://194.163.143.215:8081/detalles_info2
http://194.163.143.215:8081/datos
http://194.163.143.215:8081/materias
http://194.163.143.215:8081/saludo

### Imagenes:
![primera captura](img/imagen1.png)
***
![segunda captura](img/imagen2.png)
***
#### /detalles_info2
![detalles_info2](img/captura1.png)
#### /datos
![datos](img/captura2.png)
#### /materias
![materias](img/captura3.png)
#### /saludo
![saludo](img/captura4.png)
#### Elaborado por: David Efraín José Ramos NL 19