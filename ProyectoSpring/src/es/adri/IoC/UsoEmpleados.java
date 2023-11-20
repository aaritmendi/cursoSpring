package es.adri.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Hasta Lección 8
		//Creamos objetos de empleado
		
		Empleados Empleado1= new DirectorEmpleado();
		
		//Usamos objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan=contexto.getBean("miEmpleado",DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInformes());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		/*SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInformes());
		System.out.println("Email: " + Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		System.out.println("Email Pablo: "+ Pablo.getEmail());*/
		
		
		
		contexto.close();

	}

}
