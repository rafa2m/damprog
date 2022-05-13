package dam.temasiete.flujos.texto;
/**
 * Empleado de una empresa, se usa en distintos ejemplos
 * y actividades
 * @author rafa
 * @version 1.0
 */
public class Empleado {
	public static final int TAM_NIF=9;
	public static final int TAM_NOMBRE=40;
	public static final int TAM_EDAD=4;
	public static final int TAM_SUELDO=4;
	public static final int TAM_BAJA=2;
	public static final int TAM_REGISTRO=TAM_NIF+TAM_NOMBRE+TAM_EDAD+TAM_SUELDO+TAM_BAJA;
	private String nif;
	private String nombre;
	private int edad;
	private float sueldo;
	private boolean baja;
	
	public Empleado(String nif, String nombre, 
			int edad, float sueldo, boolean baja) {
		this.setNif(nif);
		this.setNombre(nombre);
		this.edad = edad;
		this.sueldo = sueldo;
		this.baja = baja;
	}
	public int getRecordSize() {
		return this.nif.length() +
				this.nombre.length() +
				TAM_EDAD + TAM_SUELDO + TAM_BAJA;
	}	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
		while(this.nif.length()<TAM_NIF) {
			this.nif +=" ";
		}		
	}
	
	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", baja="
				+ baja + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		while(this.nombre.length()<TAM_NOMBRE)
			this.nombre+=" ";
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public boolean isBaja() {
		return baja;
	}
	public void setBaja(boolean baja) {
		this.baja = baja;
	}	
}
