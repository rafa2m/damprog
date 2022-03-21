package dam.temaocho.escena;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ScenForm1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {		
		//Cargar el contenido del archivo /Ventana.fxml, procesarlo y crear el
		//contenido a partir del mismo.
		Parent root = FXMLLoader.load(getClass().
				getResource("/dam/temaocho/escena/forms/ventana.fxml"));
		
		//Asignar las UI creadas desde *.fxml a un Scene
		Scene scene = new Scene(root);

		//Cargar la escena en la ventana
		primaryStage.setScene(scene);

		//Le pongo un título a la ventana
		primaryStage.setTitle("Mi primera ventana FXML");
		
		primaryStage.getIcons().add(new Image(getClass().getResource("/espana-16.png").toExternalForm()));
		primaryStage.getIcons().add(new Image(getClass().getResource("/espana-32.png").toExternalForm()));
		primaryStage.getIcons().add(new Image(getClass().getResource("/espana-64.png").toExternalForm()));

		//establece una ventana minimizada y la misma no puede cambiar de
		//tamaño con la accion de arrastrar y soltar del raton
		//primaryStage.setIconified(true);
		primaryStage.setResizable(false);

		//Mostrar la ventana
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
