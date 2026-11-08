package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //método handler REST
@RequestMapping ("/api") //prefijo de la ruta
public class EjemploRestController {

    @GetMapping(path = "/detalles_info2") //ruta del método handler

    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "PrograWeb");
        respuesta.put("Ip", "192.168.1.1");
        return respuesta;

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
