package com.ia.PROYECTO.IA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PanelPrincipalController {
    @GetMapping("/PanelPrincipal")
    public String PanelPrincipal() {
        return "PantallaPrincipal";
    }
}
