package dam.temaocho.escena;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FXMLDocumentController {
	@FXML
	private Button btAbrir;

	@FXML
	private TextField tfTexto;
	
	@FXML
	private Button btAniadir;
	
	@FXML
	private Button btTerminar;

	public FXMLDocumentController() {

	}
	@FXML
	private void initialize() {
		//hago referencia a la caja de texto para cambiar a no editable
		this.tfTexto.setEditable(false);
	}

	@FXML
	private void cambiarTexto() {
		this.tfTexto.setText("Texto de prueba");
	}
	@FXML
	private void nuevaVentana() {
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.setTitle("Nueva Ventana");
        stage.initModality(Modality.WINDOW_MODAL);        
        stage.show();
    }
	@FXML
	private void aniadirJugador() {
		//coger los valores de las propiedades de la interfaz
		//que tienen la información del jugador
		//creo un objeto de tipo Jugador
		//lo añado a un array [] jugadores
		System.out.println("Jugador añadido");
	}
	@FXML
	private void terminar() {
		//recorrer el array de jugadores
		//guardar cada objeto de jugador en el fichero de objetos
		System.out.println("Jugadores guardados en el sistema");
	}
	
}
