package dam.tematres.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;

/**
 * Titular de una cuenta bancaria
 * @author rafa
 * @version 1.0
 */
public class Titular {
	private String nombre;
	private String nif;
	private String telefono;
	/**
	 * Constructor especializado en construir objetos
	 * de tipo Titular a partir del nombre y NIF del mismo
	 * @param nombre
	 * @param nif
	 */
	public Titular(String nombre, String nif) throws IOException{
		char letraNif;
		this.nombre = nombre;
		try {
			letraNif = nif.charAt(nif.length()-1);
			//tema 7
			File fichero = new File("texto.txt");
			RandomAccessFile raf = new RandomAccessFile(fichero, "w");
			raf.writeChars(nif);
			raf.close();			
		}catch(IOException e) {
			throw new ArithmeticException();
		}
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}	
}
