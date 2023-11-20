package es.Adri.prueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//Actualmente comentada la lectura del xml porque tenemos esa configuración en EmpleadosConfig
		//leer xml de config
				//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de Configuración
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
		//pedir Bean
		/*
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
		Fin de pedir Benas al contenedor*/
		
		//Pedir Beans al contenedor
		Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println("Tarea --> " + empleado.getTareas());
		System.out.println("Informe --> " + empleado.getInformes());
		
		
		//cerrar contexto
		contexto.close();

	}

}
