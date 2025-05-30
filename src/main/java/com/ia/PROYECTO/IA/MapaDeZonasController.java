package com.ia.PROYECTO.IA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapaDeZonasController {
    @GetMapping("/MapaDeZonas")
    public String MapaDeZonas() {
        return "MapaDeZonas";
    }
}
