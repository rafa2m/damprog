package dam.temaocho.escena;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FMXLControlador {
	private Jugador[] jugadores;
	private int pos;
	@FXML
	private TextField tfIdenficacion;
	@FXML
	private TextField tfNombre;
	@FXML
	private DatePicker dtFechaEntrada;
	@FXML	
	private Button btAniadir;
	@FXML
	private Button btGuardar;
	public FMXLControlador() {
		this.jugadores = new Jugador[22];
	}
	@FXML
	private void aniadir() {
		Jugador jugador = new Jugador(Integer.valueOf(tfIdenficacion.getText()),
				tfNombre.getText(),dtFechaEntrada.getValue());
		this.jugadores[pos]=jugador;
		pos++;
		this.tfIdenficacion.clear();
		this.tfNombre.clear();
		this.dtFechaEntrada.setValue(LocalDate.now());
	}
	@FXML
	private void guardar() {
		FileOutputStream fos;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("jugadores.tmp");
			oos = new ObjectOutputStream(fos); 
			for(int i=0;i<this.jugadores.length;i++) {
				oos.writeObject(jugadores[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)
					oos.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}


	}
}
