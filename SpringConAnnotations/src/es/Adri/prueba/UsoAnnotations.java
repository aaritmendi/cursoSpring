package es.Adri.prueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer xml de config
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");

		//pedir bean
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		
		//usar bean
		System.out.println(Antonio.getInformes());
		System.out.println(Antonio.getTareas());
		
		//cerrar contexto
		contexto.close();

	}

}
