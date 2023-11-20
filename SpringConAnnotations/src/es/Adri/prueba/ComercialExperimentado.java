package es.Adri.prueba;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//para usar prototype @Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	//Ejecución de código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación de bean @PostConstruct");
	}
	
	//Ejecución de código después de apagado del contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestrucción() {
		System.out.println("Ejecuta antes de la destrucción @PreDestroy");
	}
	

	public ComercialExperimentado() {
		
	}
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender y vender";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Informe generado por el Comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim2") //bena Id a utilizar 
	private CreacionInformeFinanciero nuevoInforme;

}
