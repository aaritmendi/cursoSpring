package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			//Añadir registro
			Clientes cliente1=new Clientes("Antonio","Lama","Soria");
			miSession.beginTransaction();
			miSession.save(cliente1);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado con exito");
			//Lectura de registros
			miSession.beginTransaction();
			System.out.println("Lectura del registro con Id: " + cliente1.getId());
			Clientes clienteInsertado=miSession.get(Clientes.class, cliente1.getId());
			System.out.println("Registro: " + clienteInsertado);
			miSession.getTransaction().commit();
			System.out.println("Terminado");
			
			
			//Cerrar sesion
			miSession.close();
			
		} finally{
			miFactory.close();
		}
		
		
		

	}

}
