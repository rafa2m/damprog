package dam.temaseis.listas;

import java.util.Comparator;
import java.util.Objects;
/**
 * Clase Empleado para la solución propuesta de la actividad 6.3.1
 * @author rafa
 * @version 1.0
 */
public class Empleado implements Comparator{
	public static final int ORDENAR_NIF=0;
	public static final int ORDENAR_NOMBRE=1;
	public static final int ORDENAR_EDAD=2;
	public static int ordenacion=0;
	private int edad;
	private String nombre;
	private String nif;
	public Empleado(String nombre, String nif,int edad) {	
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
	}	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nif, other.nif);
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nif=" + nif + "]";
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		if(arg0==null || arg1==null) throw new NullPointerException();
		if(!(arg0 instanceof Empleado) || !(arg1 instanceof Empleado))
			throw new ClassCastException();
		Empleado emp1 = (Empleado)arg0;
		Empleado emp2 = (Empleado)arg1;
		switch(Empleado.ordenacion) {
		case ORDENAR_NIF:
			return emp1.getNif().compareTo(emp2.getNif());
		case ORDENAR_NOMBRE:
			return emp1.getNombre().compareTo(emp2.getNombre());
		case ORDENAR_EDAD:
			return emp1.getEdad()==emp2.getEdad()?0:
				emp1.getEdad()>emp2.getEdad()?1:-1;
		default:
			return emp1.getNif().compareTo(emp2.getNif());
		}
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
}
