package com.ia.PROYECTO.IA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PanelController {
    @GetMapping("/pantallaController")
    public String PantallaController() {
        return "pantallaControl";
    }
}
