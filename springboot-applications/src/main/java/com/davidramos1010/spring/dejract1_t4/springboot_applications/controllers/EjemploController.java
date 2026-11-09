package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    /* 
    public String info(Map<String, Object> modelo){
        modelo.put("Titulo", "Servidor en linea");
        modelo.put("Servidor", "PrograWeb");
        modelo.put("Ip", "192.168.1.1");
        return "detalles_info";
    }
    */

}
