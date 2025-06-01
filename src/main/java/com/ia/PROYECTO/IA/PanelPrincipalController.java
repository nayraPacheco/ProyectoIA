package com.ia.PROYECTO.IA;

import com.ia.PROYECTO.IA.models.Sensor;
import com.ia.PROYECTO.IA.services.sensorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class PanelPrincipalController {
    @Autowired
    private sensorServices sensorServices;
    @GetMapping("/PantallaPrincipal")
    public String PanelPrincipal(Model model) {
        List<Sensor> sensores = sensorServices.getAllSensors();
        model.addAttribute("sensores", sensores);
        return "PantallaPrincipal";
    }
}
