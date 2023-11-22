package es.aaritmendi.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			//comenzar sesion
			miSession.beginTransaction();
			
			//Consulta de Clientes
			List<Clientes> losClientes=miSession.createQuery("from Clientes").getResultList();
			recorreClientesConsultados(losClientes);
			
			//Consulta dame los Lama
			System.out.println("Mostramos los que tengan apellido Lama");
			losClientes=miSession.createQuery("from Clientes cl where cl.apellidos='Lama'").getResultList();//cl es un alias
			recorreClientesConsultados(losClientes);
			
			//Muestra los que viven en Madrid o se apellidan Fernandez
			System.out.println("Madrid o Fernandez");
			losClientes=miSession.createQuery("from Clientes cl where cl.apellidos='Fernandez' or cl.direccion='Madrid'").getResultList();
			recorreClientesConsultados(losClientes);
			
			
			//commit
			miSession.getTransaction().commit();
			System.out.println("Terminado");
			
			//Cerrar sesion
			miSession.close();
			
		} finally {
			miFactory.close();
		}
		

	}

	private static void recorreClientesConsultados(List<Clientes> losClientes) {
		for(Clientes unCliente:losClientes) {
			System.out.println(unCliente);
		}
	}

}
