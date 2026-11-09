package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import com.davidramos1010.spring.dejract1_t4.springboot_applications.models.Empleados;

import org.springframework.ui.Model;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")

        public String info(Model modelo){
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "calle 1ra No. 20", "Gerente",
                                            35, 123456789, 001);

        modelo.addAttribute("Empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados") 
        public List<Empleados> ListaEmpleados(){
            return Arrays.asList(
            new Empleados("María", "Perez", "Calle segunda no. 2", 
                "Secretaria", 20, 123654987, 02),
            new Empleados("David", "Ramos", "Calle tercera no.3",
                "Programador", 21, 951123456, 03),
            new Empleados("Damaris", "Rios", "Calle cuarta no.4", "Internacionalista", 20, 951234567, 04),
            new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
            new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
            new Empleados("Ana", "González", "Avenida central no.5", "Diseñadora", 30, 456789123, 05),
            new Empleados("Pedro", "Sánchez", "Boulevard no.6", "Analista", 25, 789123456, 06)
            );
        }
    /* 
    public String info(Map<String, Object> modelo){
        modelo.put("Titulo", "Servidor en linea");
        modelo.put("Servidor", "PrograWeb");
        modelo.put("Ip", "192.168.1.1");
        return "detalles_info";
    }
    */

}
