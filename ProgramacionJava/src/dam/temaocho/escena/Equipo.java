package dam.temaocho.escena;

import java.util.Arrays;

public class Equipo {
	private String nombre;
	private int antiguedad;
	private String[] patrocinadores;
	private double presupuesto;
	public Equipo(String nombre, int antiguedad) {		
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}
	public Equipo(String nombre, int antiguedad, String[] patrocinadores) {		
		this(nombre,antiguedad);
		this.patrocinadores = patrocinadores;
	}
	public Equipo(String nombre, int antiguedad,String[] patrocinadores, double presupuesto) {		
		this(nombre,antiguedad,patrocinadores);
		this.presupuesto = presupuesto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String[] getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(String[] patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", antiguedad=" + antiguedad + ", patrocinadores="
				+ Arrays.toString(patrocinadores) + ", presupuesto=" + presupuesto + "]";
	}	
}
