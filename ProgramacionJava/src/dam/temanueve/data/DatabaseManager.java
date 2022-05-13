package dam.temanueve.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Gestor de la base de datos
 * @author rafa
 * @version 1.0
 */
public class DatabaseManager {
	private Connection connection=null;
	private Statement statement=null;
	private boolean drugsUpdated=false;
	private ArrayList<Drug> drugsData;
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
			this.drugsData = new ArrayList<Drug>();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	/**
	 * Elimina duplicados de tarjetas para los campos
	 * clave de la tabla
	 */
	public void deleteDuplicatesTarjeta() {
		TreeSet<Tarjeta> tarjetasNoDuplicadas;
		ArrayList<Tarjeta> tarjetas;

		tarjetas = getTarjetas();
		if(tarjetas.size()==0) return;

		tarjetasNoDuplicadas=new TreeSet<Tarjeta>();
		//guardo en el conjunto las tarjetas sin duplicar
		for(Tarjeta tarjeta:tarjetas)
			tarjetasNoDuplicadas.add(tarjeta);

		try {
			this.statement = this.connection.createStatement();

			this.statement.executeUpdate("TRUNCATE TABLE tarjeta");

			for(Tarjeta tarjeta:tarjetasNoDuplicadas) {

				this.statement.executeUpdate("INSERT INTO tarjeta (numero,tipo,iban) VALUES('" +
						tarjeta.getNumero()+"','"+
						tarjeta.getTipo().toLowerCase()+"','" +
						tarjeta.getIban().toLowerCase()+"')");
			}
			this.statement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}				
	}
	public ArrayList<Tarjeta> getTarjetas() {
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();		
		Tarjeta tarjeta = null;			
		try {
			//creamos un objeto de consulta 
			//statement = this.connection.createStatement();

			this.statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			//obtengo el conjunto de resultados porque se que
			//la sentencia ejecutada los ha producido (SELECT

			ResultSet resultSet = statement.executeQuery("SELECT numero,tipo,iban FROM tarjeta");

			tarjetas = new ArrayList<Tarjeta>();
			while(resultSet.next()) {			
				tarjeta = new Tarjeta(resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3));
				tarjetas.add(tarjeta);			
			}
			this.statement.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return tarjetas;
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
			//statement = this.connection.createStatement();

			this.statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			//obtengo el conjunto de resultados porque se que
			//la sentencia ejecutada los ha producido (SELECT

			ResultSet resultSet = statement.executeQuery("SELECT id,drug_name,drug_company,drug_generic FROM drugs");
			for(int i=0;i<2;i++) {

				drugs = new ArrayList<Drug>();
				while(resultSet.next()) {			
					drug = new Drug(resultSet.getInt(1),
							resultSet.getString(2),
							resultSet.getString(3),
							resultSet.getString(4));
					drugs.add(drug);			
				}
			}
			this.statement.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return drugs;
	}
	public ArrayList<Drug> getDrugs(String drugCompany, ColumnOrder... columnOrder) {
		ArrayList<Drug> drugs = new ArrayList<Drug>();
		Drug drug = null;			
		try {
			//creamos un objeto de consulta 
			this.statement = this.connection.createStatement();
			//obtengo el conjunto de resultados porque se que
			//la sentencia ejecutada los ha producido (SELECT
			ResultSet resultSet = statement.executeQuery("SELECT id,drug_name,"
					+ "drug_company,drug_generic FROM drugs WHERE drug_company='" + 
					drugCompany +"' ORDER BY " + 
					columnOrder[0].getIndex() + " " + columnOrder[0].getOrder());
			while(resultSet.next()) {			
				drug = new Drug(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4));
				drugs.add(drug);			
			}
			this.statement.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return drugs;
	}
	/**
	 * Añade un nuevo medicamento a la base de datos
	 * @param drug Medicamento que se va a añadir
	 * @return True si se consigue añadir el nuevo medicamento
	 */
	public boolean addDrug(Drug drug) {
		String insert="";
		boolean added=false;
		try {
			insert = "'" + drug.getDrugName() +
					"','" +  drug.getDrugCompany() +
					"','" + drug.getDrugGeneric() + "'";
			added = (this.statement.executeUpdate("INSERT INTO drug (drug_name,"
					+ "drug_company, drug_generic VALUES(" + insert +")"))>0;
					this.statement.close();
		    return added;
		}catch(SQLException e) {
			return added;
		}
	}
	public boolean deleteDrug(int id) {
		boolean deleted=false;
		try {
			if(!this.statement.execute("DELETE FROM drug WHERE id=" + id)) {
				deleted = this.statement.getUpdateCount()>0;
			}		
			this.statement.close();
		}catch(SQLException e) {
			return deleted;
		}
		return deleted;
	}
	public boolean updateDrug(Drug drug) {
		boolean updated = false;
		String changes="";
		try {
			/*changes="drug_name='" + drug.getDrugName() +
					"',drug_company='" + drug.getDrugCompany() +
					"',drug_generic='" + drug.getDrugGeneric() +
					"'";
			return (this.statement.executeUpdate("UPDATE drug SET " + changes))>0;*/


			/*changes = "UPDATE drug SET drug_name='?',drug_company='?',drug_generic='?'"
					+ " WHERE id=" + drug.getId();
			this.statement.executeUpdate(changes, new int[] {2,3,4});*/

			if(this.statement.isClosed()) return false;

			changes = "UPDATE drug SET ?='" + drug.getDrugName() +
					"',?='" + drug.getDrugCompany() + "',?='" + drug.getDrugGeneric() +
					"' WHERE id=" + drug.getId();

			updated= (this.statement.executeUpdate(changes, new String[] {"drug_name",
					"drug_company","drug_generic"}))>0;
		    this.statement.close();
		}catch(SQLException e) {
			return updated;
		}	
		return updated;
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
