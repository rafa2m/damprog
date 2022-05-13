package dam.temacinco.herencia;

public class Director extends Empleado {
	public Director(String nombre, int edad,String nif) {
		super(nombre, edad,nif);
	}
	protected final void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	@Override
	public String toString() {
		return "Director [bonificacion=" + bonificacion + "]";
	}	
}
