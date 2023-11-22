package es.aaritmendi.conexionHibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerPedidosCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.addAnnotatedClass(Pedido.class)
				.buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			miSession.beginTransaction();
			
			//Obtener el cliente de la tabla cliente de la BBDD
			Cliente elCliente=miSession.get(Cliente.class, 4);
			System.out.println("Cliente: " + elCliente.getNombre());
			System.out.println("Pedidos: " + elCliente.getPedidos());
			
			
			miSession.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			miSession.close();
			miFactory.close();
		}

	}

}
