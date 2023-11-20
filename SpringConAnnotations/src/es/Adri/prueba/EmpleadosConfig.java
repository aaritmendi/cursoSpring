package es.Adri.prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.Adri.prueba")
@PropertySource("classpath:datosEmpresa.propiedades")
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
