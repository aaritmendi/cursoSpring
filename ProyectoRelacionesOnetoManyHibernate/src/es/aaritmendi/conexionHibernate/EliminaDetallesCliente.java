package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//Falla por tener la FK actualmente en la BBDD si la eliminamos funciona correctamente
public class EliminaDetallesCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			
			
			miSession.beginTransaction();
			//Seleccionamos el cliente con id que necesitemos 
			DetallesCliente detalleDelCliente=miSession.get(DetallesCliente.class, 4);
			
			//Desasociar DetallesCliente de Cliente
			detalleDelCliente.getElCliente().setDetallesCliente(null);
			
			if(detalleDelCliente!=null) {
				//Eliminamos el objeto seleciionado anteriormente
				miSession.delete(detalleDelCliente);
			}
			
			miSession.getTransaction().commit();
			if(detalleDelCliente!=null)System.out.println("Registro eliminado con exito");
			else System.out.println("No se encontró el cliente");
			
			
			
			//Cerrar sesion
			miSession.close();
			
		} finally{
			miFactory.close();
		}

	}

}
