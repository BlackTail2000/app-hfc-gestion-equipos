package pe.edu.cibertec.app_hfc_gestion_equipos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_hfc_gestion_equipos.controller.remoteservice.ProyectosClient;

@RestController
@RequiredArgsConstructor
public class GestionEquiposController {
    private final ProyectosClient proyectosClient;

    @GetMapping("/verificar")
    public String disponibilidadDeMateriales() {
        int random = (int) (Math.random() * 2);
        if(random == 1) return "Materiales Disponibles";
        else return "Materiales no Disponibles";
    }
    @GetMapping("/proyecto/estado")
    public String verEstado(){
        return proyectosClient.verEstadoProyecto();
    }
}
