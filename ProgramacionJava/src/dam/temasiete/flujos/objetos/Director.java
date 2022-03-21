package dam.temasiete.flujos.objetos;

public class Director extends Empleado{
	private static final long serialVersionUID = 1L;
	private Empleado secretario=null;
	
	public Director(String nombre, int edad, Departamento departamento) {
		super(nombre, edad, departamento);		
	}
	public void setSecretario(Empleado secretario) {
		this.secretario = secretario;
	}
	public Empleado getSecretario() {
		return secretario;
	}	
}
