package dam.temasiete.flujos.objetos;

import java.io.Serializable;

public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String ubicacion;
	public Departamento(String nombre) {
		this.nombre = nombre;
	}
	public Departamento(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}		
}
