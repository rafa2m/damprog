package dam.temaocho.escena;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * Primera interfaz gráfica con JavaFx
 * @author rafa
 * @version 1.0
 */
public class MainScene extends Application {

	@Override
	public void start(Stage primaryStage) {
		//se crea el grupo de nodos
		Group group = new Group(); 

		//se crea la escena a partir del grupo, indicando ancho 
		//y alto
		Scene scene = new Scene(group ,600, 300); 

		//se modifica el color de fondo de la escena
		scene.setFill(Color.BROWN);  

		//se pone título al escenario
		primaryStage.setTitle("Sample Application"); 

		//se asocia la escena al escenario
		primaryStage.setScene(scene); 

		//se muestra el escenario
		primaryStage.show(); 

	}
	/**
	 * Punto de entrada a la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
