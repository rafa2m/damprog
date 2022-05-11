package dam.temanueve.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.eclipse.jdt.annotation.NonNull;
/**
 * Gestor de la base de datos
 * @author rafa
 * @version 1.0
 */
public class DatabaseManager {
	private Connection connection=null;
	private Statement statement=null;
	/**
	 * Constructor especializado en inicializar objetos
	 * de tipo DatabaseManager a partir de un objeto de conexión
	 * que no puede ser nulo
	 * @param connection Objeto de conexión
	 */
	public DatabaseManager(@NonNull Connection connection) {
		this.connection = connection;
		try {
			this.statement = connection.createStatement();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}	
	/**
	 * Obtiene todos los medicamentos en una lista
	 * @return Lista de medicamentos
	 */
	public ArrayList<Drug> getDrugs() {
		ArrayList<Drug> drugs = new ArrayList<Drug>();
		Drug drug = null;			
		try {
			//creamos un objeto de consulta 
			statement = this.connection.createStatement();
			//obtengo el conjunto de resultados porque se que
			//la sentencia ejecutada los ha producido (SELECT
			ResultSet resultSet = statement.executeQuery("SELECT id,drug_name,drug_company,drug_generic FROM drug");
			while(resultSet.next()) {			
				drug = new Drug(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4));
				drugs.add(drug);			
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return drugs;
	}
	/**
	 * Método de utilidad para saber el tipo que corresponde
	 * a un Statement
	 * @param statement Instrucción de la que se quiere obtener el tipo
	 * @return Nombre del tipo de instrucción
	 */
	public static String getResultSetType(Statement statement) {
		//obtener el tipo de ResultSet y el modo de acceso
		int resultSetType;
		String resultSetTypeName="";
		try {
			resultSetType = statement.getResultSetType();
			switch(resultSetType) {
			case ResultSet.TYPE_FORWARD_ONLY:
				resultSetTypeName="FORWARD_ONLY";
				break;
			case ResultSet.TYPE_SCROLL_INSENSITIVE:
				resultSetTypeName="SCROLL_INSENSITIVE";
				break;
			case ResultSet.TYPE_SCROLL_SENSITIVE:
				resultSetTypeName="SCROLL_SENSITIVE";
				break;
			}
		} catch (SQLException e) {			
			resultSetTypeName="Tipo de sentencia desconocido";
		}
		return resultSetTypeName;
	}
	/**
	 * Método de utilidad para saber el modo de acceso que corresponde
	 * a un Statement
	 * @param statement Instrucción de la que se quiere obtener el modo de acceso
	 * @return Nombre del modo de acceso de la instrucción
	 */
	public static String getResultSetMode(Statement statement) {
		String resultSetModeName="";
		int resultSetMode;
		try {
			resultSetMode = statement.getResultSetConcurrency();
			switch(resultSetMode) {
			case ResultSet.CONCUR_READ_ONLY:
				resultSetModeName="CONCUR_READ_ONLY";
				break;
			case ResultSet.CONCUR_UPDATABLE:
				resultSetModeName="CONCUR_UPDATABLE";
				break;
			}
		} catch (SQLException e) {			
			resultSetModeName="Modo de acceso desconocido";
		} 
		return resultSetModeName;		
	}
}
