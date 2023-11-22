package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			
			
			miSession.beginTransaction();
			
			//Obtener objeto de detallesCliente
			DetallesCliente detallesDeCliente=miSession.get(DetallesCliente.class, 1);
			
			System.out.println(detallesDeCliente);
			System.out.println(detallesDeCliente.getElCliente());
			
			System.out.println("Vamos a eliminar en casacda");
			miSession.delete(detallesDeCliente);
			
			miSession.getTransaction().commit();
			
		}
			catch (Exception ex1){
				ex1.printStackTrace();
			}
			
		 finally{
			//Cerrar sesion
			miSession.close();
			miFactory.close();
		}

	}

}
