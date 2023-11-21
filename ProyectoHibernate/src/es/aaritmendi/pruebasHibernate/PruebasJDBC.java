package es.aaritmendi.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;



public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Indicamos la URL de nuestro servidor y los datos de acceso
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false&characterEncoding=UTF-8";
		String user ="root";
		String pwd ="";
		
		
		try {
			System.out.println("Intentando conectar con la BBDD " + jdbcUrl);
			Connection miConexion=DriverManager.getConnection(jdbcUrl, user, pwd);
			System.out.println("Conexión exitosa!!!!");
			
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

}
