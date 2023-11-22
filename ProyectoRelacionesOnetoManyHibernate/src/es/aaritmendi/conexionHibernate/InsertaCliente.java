package es.aaritmendi.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto sesion factory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).addAnnotatedClass(Pedido.class).buildSessionFactory();
		
		//Crear el objeto de tipo session
		Session miSession=miFactory.openSession();	
		
		try {
			//Crear cliente
			Cliente cliente1=new Cliente("Susana","Perez","Boadilla");
			DetallesCliente detallesCliente1=new DetallesCliente("www.susanita.es","680358502","La clienta");
			
			//Asociar los objetos con la relación en la clase Cliente
			cliente1.setDetallesCliente(detallesCliente1);	
			miSession.beginTransaction();
			
			//Esto guarda la info en las 2 tablas relacionadas
			miSession.save(cliente1);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado con exito");
			
			
			
			//Cerrar sesion
			miSession.close();
			
		} finally{
			miFactory.close();
		}

	}

}
