package es.adri.IoC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	
	public String getTareas() {
		return "Gestiono a mis empleados de gestión";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe: " + informeNuevo.getInforme();
	}
}
