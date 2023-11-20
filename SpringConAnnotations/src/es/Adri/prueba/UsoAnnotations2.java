package es.Adri.prueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//leer xml de config
				ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//pedir bean
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia=contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		//apuntan al mismo objeto en memoria?
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		else {
			System.out.println("No apuntan al mismo objeto en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		
		//cerrar contexto
		contexto.close();

	}

}
