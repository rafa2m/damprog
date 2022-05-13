package dam.temacinco.herencia;

public class Empleado extends Persona{
	private double sueldo; 
	protected int bonificacion;
	private int numero;
	public Empleado(String nombre, int edad,String nif) {
		super(nombre, edad,nif);				
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + 
				", bonificacion=" + bonificacion + "]";
	}
	@Override
	public void setNif(String nif) {
		// TODO Auto-generated method stub
		
	}		
}
