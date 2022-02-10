package dam.temacuatro.herencia;

public class Empleado extends Persona {
	private float salario;
	public Empleado(String nombre) {
		super.setNombre(nombre);
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
