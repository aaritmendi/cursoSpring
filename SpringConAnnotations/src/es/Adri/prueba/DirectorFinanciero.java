package es.Adri.prueba;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;
	
	//creamos variables para insertar valores desde fichero externo "datosEmpresa.propiedades"
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	
	
	


}
