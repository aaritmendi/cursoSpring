package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			
			
			miSession.beginTransaction();
			//Seleccionamos el cliente con id que necesitemos 
			Cliente elCliente=miSession.get(Cliente.class, 3);
			
			if(elCliente!=null) {
				System.out.println("Voy a eliminar al cliente: " +  elCliente.getNombre());
				//Eliminamos el objeto seleciionado anteriormente
				miSession.delete(elCliente);
			}
			
			miSession.getTransaction().commit();
			if(elCliente!=null)System.out.println("Registro eliminado con exito");
			else System.out.println("No se encontró el cliente");
			
			
			
			//Cerrar sesion
			miSession.close();
			
		} finally{
			miFactory.close();
		}

	}

}
