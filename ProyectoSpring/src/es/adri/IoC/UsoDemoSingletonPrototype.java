package es.adri.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de XML de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//petición de beans al contenedor Spring
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Manolo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Juan=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Ana=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria);
		System.out.println(Pablo);
		System.out.println(Manolo);
		System.out.println(Juan);
		System.out.println(Ana);
		

	}

}
