package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.davidramos1010.spring.dejract1_t4.springboot_applications.models.dto.EmpleadoDTO;

@Controller
@RequestMapping("/empleados")
public class EmpleadoWebController {

    @Value("${app.autor}")
    private String autor;

    @Value("${app.proyecto}")
    private String proyecto;

    private final List<EmpleadoDTO> empleados = new CopyOnWriteArrayList<>(List.of(
            new EmpleadoDTO(1, "María Perez", "Secretaria", 20),
            new EmpleadoDTO(2, "David Ramos", "Programador", 21),
            new EmpleadoDTO(3, "Damaris Rios", "Internacionalista", 20),
            new EmpleadoDTO(4, "Juan Rodriguez", "Gerente", 35),
            new EmpleadoDTO(5, "Luis Martínez", "Programador", 28)));

    @ModelAttribute("autor")
    public String autor() {
        return autor;
    }

    @ModelAttribute("proyecto")
    public String proyecto() {
        return proyecto;
    }

    @GetMapping
    public String listar(@RequestParam(required = false) String puesto, Model model) {
        List<EmpleadoDTO> resultado = new ArrayList<>();
        for (EmpleadoDTO e : empleados) {
            if (puesto == null || puesto.isBlank() || e.getPuesto().equalsIgnoreCase(puesto.trim())) {
                resultado.add(e);
            }
        }
        model.addAttribute("empleados", resultado);
        model.addAttribute("filtro", puesto);
        return "empleados/lista";
    }

    @GetMapping("/{id}")
    public String detalle(@PathVariable Integer id, Model model) {
        EmpleadoDTO encontrado = empleados.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (encontrado == null) {
            return "redirect:/empleados";
        }
        model.addAttribute("empleado", encontrado);
        return "empleados/detalle";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("empleado", new EmpleadoDTO());
        return "empleados/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("empleado") EmpleadoDTO empleado) {
        int siguienteId = empleados.stream().mapToInt(EmpleadoDTO::getId).max().orElse(0) + 1;
        empleado.setId(siguienteId);
        empleados.add(empleado);
        return "empleados/resultado";
    }
}