package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidramos1010.spring.dejract1_t4.springboot_applications.models.dto.EmpleadoDTO;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoRestController {

    @PostMapping
    public ResponseEntity<EmpleadoDTO> crear(@RequestBody EmpleadoDTO empleado) {
        return ResponseEntity.status(HttpStatus.CREATED).body(empleado);
    }
}