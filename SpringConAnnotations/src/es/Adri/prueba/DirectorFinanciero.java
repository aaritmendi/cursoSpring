package es.Adri.prueba;

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

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	


}
