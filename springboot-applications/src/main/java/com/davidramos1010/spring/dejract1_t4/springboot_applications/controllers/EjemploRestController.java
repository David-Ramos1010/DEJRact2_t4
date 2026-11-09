package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidramos1010.spring.dejract1_t4.springboot_applications.models.Empleados;
import com.davidramos1010.spring.dejract1_t4.springboot_applications.models.dto.ClaseDTO;


@RestController //método handler REST
@RequestMapping ("/api") //prefijo de la ruta
public class EjemploRestController {
 
    /*
    @GetMapping(path = "/detalles_info2") //ruta del método handler
 
    public Map<String, Object> detalles_info2(){
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente",
                                            35, 123456789, 001);


        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos Empleado");
        respuesta.put("Información", empleado1);
        return respuesta;

    }
*/

    @GetMapping(path = "/detalles_info2")

    public ClaseDTO detalles_info2() {
        ClaseDTO usuario1 = new ClaseDTO();

        usuario1.setTitulo( "Administrador");
        usuario1.setUsuario("davidramos1010");

        return usuario1;

    }

    @GetMapping("/datos")
    public Map<String, Object> datos() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "David Efraín José Ramos");
        respuesta.put("iniciales", "DEJR");
        respuesta.put("proyecto", "springboot-applications");
        return respuesta;
    }

    @GetMapping("/materias")
    public List<Map<String, Object>> materias() {
        return List.of(
            Map.of("grupo", "5SF", "nombre", "Desarrollo sustentable", "promedio", 70),
            Map.of("grupo", "7SC",   "nombre", "Programación Web",    "promedio", 80),
            Map.of("grupo", "5SD",   "nombre", "Arquitectura de Computadoras","promedio", 70),
            Map.of("grupo", "5SD",   "nombre", "Simulación","promedio", 90),
            Map.of("grupo", "4SU",   "nombre", "Topicos avanzados de programación","promedio", 60)
        );
    }

    @GetMapping("/saludo")
        public String saludo() {
            return "¡Hola mundo!";
        }
}
