package pe.com.servicio.mantenimiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MantenimientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MantenimientoApplication.class, args);
		System.out.println("Se inicia MantenimientoApplication");
	}

}
