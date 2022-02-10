package dam.temacuatro.herencia;

public class Director extends Empleado{
	private int bonif;
	public Director(String nombre,int bonif) {
		super(nombre);
		this.bonif = bonif;
	}
	@Override
	public void setSalario(float salario) {		
		super.setSalario(salario + (salario * (1+this.bonif/100)));
	}	
}
