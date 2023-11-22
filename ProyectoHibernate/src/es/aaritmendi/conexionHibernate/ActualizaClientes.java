package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			//Actualizar registro
			/*
			int ClienteId=3;
			miSession.beginTransaction();
			Clientes miCliente=miSession.get(Clientes.class, ClienteId);
			miCliente.setNombre("Jorge");
			*/
			
			//Actualizar con HQL
			/*
			miSession.beginTransaction();
			miSession.createQuery("update Clientes set Apellidos='Dominguez' where Apellidos LIKE 'D%'").executeUpdate();			
 
			miSession.getTransaction().commit();
			System.out.println("Registro actualizado con exito");
			*/
			
			//Eliminar con HQL
			miSession.beginTransaction();
			miSession.createQuery("delete Clientes where Direccion = 'Malaga'").executeUpdate();			
 
			miSession.getTransaction().commit();
			System.out.println("Registro actualizado con exito");
			
			
			
			//Cerrar sesion
			miSession.close();
			
		} finally{
			miFactory.close();
		}
		
		
		

	}

}
