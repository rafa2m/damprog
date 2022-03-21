package dam.temasiete.flujos.objetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private transient Departamento departamento;
	private LocalDate fechaAlta=null;
	
	public Empleado(String nombre, int edad, Departamento departamento) {		
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
	}
	/**
	 * Este método intercepta la lectura de objetos desde un flujo de entrada
	 * @param in
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(ObjectInputStream in) 
			throws IOException, ClassNotFoundException{
		in.defaultReadObject();
		this.departamento = new Departamento(in.readUTF());
	}
	/**
	 * Intercepta la escritura de objetos hacia un flujo de salida
	 * @param out
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeUTF(this.departamento.getNombre());	
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" 
	+ edad + ", departamento=" + departamento + ",fecha alta=" + this.fechaAlta+"]";
	}		
}
