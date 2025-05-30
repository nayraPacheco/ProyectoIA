package com.ia.PROYECTO.IA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {
    @GetMapping("/Datos")
    public String Datos(){
        return "Datos";
    }
}
