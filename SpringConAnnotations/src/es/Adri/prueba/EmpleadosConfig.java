package es.Adri.prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.Adri.prueba")
public class EmpleadosConfig {
	
	//definir el Bean para InformeFinancieroDtoCompras
	
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //será el id del Bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	
	//definir el Bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
}
