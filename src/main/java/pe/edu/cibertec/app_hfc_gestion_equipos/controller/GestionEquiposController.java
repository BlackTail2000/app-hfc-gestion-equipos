package pe.edu.cibertec.app_hfc_gestion_equipos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionEquiposController {

    @GetMapping("/verificar")
    public String disponibilidadDeMateriales() {
        int random = (int) (Math.random() * 2);
        if(random == 1) return "Materiales Disponibles";
        else return "Materiales no Disponibles";
    }
}
