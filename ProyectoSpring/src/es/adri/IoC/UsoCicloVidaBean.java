package es.adri.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cargar xml de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Obtención del bean
		Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getInformes());
		
		//Cerrar el contexto
		contexto.close();
		

	}

}
