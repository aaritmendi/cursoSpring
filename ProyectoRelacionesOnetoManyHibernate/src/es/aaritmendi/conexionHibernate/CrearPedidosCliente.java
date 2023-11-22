package es.aaritmendi.conexionHibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearPedidosCliente {

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
			Cliente elCliente1=miSession.get(Cliente.class, 5);
			
			//Crear pedidos del Cliente
			Pedido pedido1=new Pedido(new GregorianCalendar(2020,7,24));
			Pedido pedido2=new Pedido(new GregorianCalendar(2021,4,8));
			Pedido pedido3=new Pedido(new GregorianCalendar(2018,12,5));
			
			//Agregar pedidos creados al cliente creado
			elCliente1.agregarPedidos(pedido1);
			elCliente1.agregarPedidos(pedido2);
			elCliente1.agregarPedidos(pedido3);
			
			//Guardar los pedidos en la tabla Pedido de la BBDD
			miSession.save(pedido1);
			miSession.save(pedido2);
			miSession.save(pedido3);
			
			
			miSession.getTransaction().commit();
			System.out.println("Registros insertados con exito");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			miSession.close();
			miFactory.close();
		}

	}

}
