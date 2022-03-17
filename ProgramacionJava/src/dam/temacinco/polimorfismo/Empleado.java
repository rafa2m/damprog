package dam.temacinco.polimorfismo;
/**
 * Clase abstracta que se usará para implementar
 * el concepto de polimorfismo, con el método
 * setSalario()
 * @author rafa
 * @version 1.0
 */
public abstract class Empleado {
	private String nombre;
	protected float salario;
	public Empleado(String nombre, float salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	public abstract void setSalario(float salario);
}
