package dam.temacinco.polimorfismo;

public class Administrador extends Empleado{

	public Administrador(String nombre, float salario) {
		super(nombre, salario);		
	}

	@Override
	public void setSalario(float salario) {		
		this.salario = salario;
	}
}
