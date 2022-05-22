package dam.temaseis.stream;

public class Alumno {
	private String nombre;
	private String nif;
	private int edad;
	private double calificacion;
	public Alumno(String nombre, String nif, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
		this.calificacion = calificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public double getCalificacion() {
		return this.calificacion;
	}
}
