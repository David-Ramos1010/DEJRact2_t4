# 2. Act2. Spring MVC
## Comprender el patrón MVC en Spring Boot usando Thymeleaf para renderizar vistas del lado del servidor, estructurar datos con clases DTO, manejar parámetros de distintas formas (@RequestParam, @PathVariable, @ModelAttribute), configurar valores externos con @value, y probar peticiones POST con Postman.
***
#### Elaborado por: David Efraín José Ramos NL 19
***
### Preguntas de la fase tres:
##### a) ¿Qué es el patrón MVC y cómo se ve reflejado en tu proyecto (qué parte es el Modelo, cuál la Vista y cuál el Controlador)?
El patrón MVC o Modelo Vista controlador es una propuesta de arquitectura del software utilizada para separar el código por sus distintas responsabilidades, manteniendo distintas capas que se encargan de hacer una tarea muy concreta, lo que ofrece beneficios diversos.

Como su nombre lo indica esta se divide en tres componentes distintos:

1. Modelo (datos): El trabajo del modelo es simplemente administrar los datos. Ya sea que los datos provengan de una base de datos, una API o un objeto JSON, el modelo es responsable de administrarlos.
2. Vista (UI): El trabajo de la vista es decidir qué verá el usuario en su pantalla y cómo.
3. Controlador (Cerebro): La responsabilidad del controlador es extraer, modificar y proporcionar datos al usuario. Esencialmente, el controlador es el enlace entre  y el modelo.

En mi proyecto se ve así:

```java
@Controller //<- Controlador (Cerebro)
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Map<String, Object> modelo){ // <- Modelo(datos)
        modelo.put("Titulo", "Servidor en linea");
        modelo.put("Servidor", "PrograWeb");
        modelo.put("Ip", "192.168.1.1");
        return "detalles_info"; //<- Vista (UI)

    }
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