package es.aaritmendi.conexionHibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
			
			//Usamos HQL para sergurarnos que funciona bien LAZY (on demannd)
			Query<Cliente> consulta=miSession.createQuery("SELECT CL FROM Cliente CL JOIN FETCH CL.pedidos WHERE CL.id=:elClienteId", Cliente.class);
			consulta.setParameter("elClienteId", 4);
			
			//Cargar info en memoria
			Cliente elCliente=consulta.getSingleResult();
			
			System.out.println("Cliente: " + elCliente.getNombre());
			
			
			miSession.getTransaction().commit();
			miSession.close();
			System.out.println("Pedidos: " + elCliente.getPedidos());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			miSession.close();
			miFactory.close();
		}

	}

}
