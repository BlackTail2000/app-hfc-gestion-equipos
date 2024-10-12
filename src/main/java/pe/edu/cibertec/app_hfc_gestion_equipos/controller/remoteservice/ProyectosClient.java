package pe.edu.cibertec.app_hfc_gestion_equipos.controller.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-hfc-proyectos")
public interface ProyectosClient {
    @GetMapping("/estado")
    String verEstadoProyecto();
}
