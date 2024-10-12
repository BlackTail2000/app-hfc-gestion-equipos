package pe.edu.cibertec.app_hfc_gestion_equipos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppHfcGestionEquiposApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppHfcGestionEquiposApplication.class, args);
	}

}
