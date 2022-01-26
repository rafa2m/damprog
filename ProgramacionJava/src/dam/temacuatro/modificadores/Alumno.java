package dam.temacuatro.modificadores;

public class Alumno extends Persona {
	private String nombre;
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
