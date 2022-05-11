package dam.temanueve.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jdt.annotation.NonNull;

public class DatabaseConnection {
	private Connection connection;
	//"jdbc:mysql://localhost/biblioteca?user=root&password=root"
	public boolean connect(@NonNull String connectionString) {
		Connection connection=null;
		try {
			//cargar el driver
			DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());
			//otra manera de cargar el controlador
			//Class.forName("com.mysql.cj.jdbc.Driver");			
			//crear un objeto de conexión
			 connection = 
					DriverManager.getConnection(connectionString);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return connection==null?false:true;
	}
	public boolean disconnect() {
		try {
			this.connection.close();
			return true;
		} catch (SQLException e) {			
			return false;
		}
	}
}
