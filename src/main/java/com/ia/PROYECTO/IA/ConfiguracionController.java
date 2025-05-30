package com.ia.PROYECTO.IA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfiguracionController {
    @GetMapping ("/Configuracion")
    public String Configuracion(){
        return "Configuracion";
    }
}
