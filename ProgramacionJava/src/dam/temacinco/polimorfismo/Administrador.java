package dam.temacinco.polimorfismo;
/**
 * Clase que representa al administrador de la empresa
 * , también es un empleado de la misma.
 * @author rafa
 * @version 1.0
 */
public class Administrador extends Empleado{

	public Administrador(String nombre, float salario) {
		super(nombre, salario);		
	}

	@Override
	public void setSalario(float salario) {		
		this.salario = salario;
	}
}
