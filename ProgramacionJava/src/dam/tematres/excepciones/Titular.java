package dam.tematres.excepciones;
/**
 * Titular de la cuenta bancaria
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
	public Titular(String nombre, String nif) {
		this.nombre = nombre;
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
