package dam.temacinco.polimorfismo;

public class Director extends Empleado {
	private float bonificacion;
	public Director(String nombre, float salario) {
		super(nombre, salario);		
	}
	public Director(String nombre, float salario, float bonificacion) {
		this(nombre,salario);
		this.bonificacion = bonificacion;
	}
	public void setBonificacion(float bonificacion) {
		this.bonificacion=bonificacion;
	}
	@Override
	public void setSalario(float salario) {		
		this.salario+=this.bonificacion;
	}	
}
