package dam.temanueve.data;

public class TestDatabase {

	public static void main(String[] args) {		
		DatabaseConnection databaseConnection =
				new DatabaseConnection();
		if(databaseConnection.connect("jdbc:mysql://localhost/biblioteca?"
				+ "user=root&password=root")) {			
			DatabaseManager databaseManager = 
					new DatabaseManager(databaseConnection.getConnection());
			
			/*ArrayList<Drug> drugs = databaseManager.getDrugs("Ventura Corporation, Ltd.",
					new ColumnOrder(1,"ASC"), new ColumnOrder(2,"DESC"));
			//ArrayList<Drug> drugs = databaseManager.getDrugs();

			for(Drug drug:drugs) {
				System.out.println(drug);
			}*/
			
			//código para la eliminación de duplicados en la
			//tabla tarjeta
			databaseManager.deleteDuplicatesTarjeta();
		}
	}
}
