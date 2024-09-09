package com.ejercicio.matematico.ejercicio_matematico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ejercicioController {
    private static final Double PI = 3.141592;


    
    @GetMapping("/areatriangulo/{base}/{altura}")
    public Double areaTriangulo(@PathVariable Double base,@PathVariable Double altura) {
        Double area = (base * altura) / 2;
        return area;
    }
    
    @GetMapping("/areacirculo/{radio}")
    public Double areaCirculo(@PathVariable Double radio) {
        return PI * Math.pow(radio, 2);
    }
    
}
