package dam.tematres.logapache.ficheros;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dam.tematres.logapache.TestLog4j;

public class Persona {
	private String nombre;
	private byte edad;

	@Override
	public String toString() {
		return "Persona [getNombre()=" + 
				getNombre() + ", getEdad()=" + getEdad() + "]";
	}
	/**
	 * Registra mensajes de depuración con nivel DEBUG
	 */
	public void logginToString() {
		Logger loggerError = LogManager.getLogger(this.getClass());
		loggerError.debug("Persona: " + this.toString());
	}
	public Persona(String nombre, byte edad) {		
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}

}
