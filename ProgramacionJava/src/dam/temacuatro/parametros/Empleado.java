package dam.temacuatro.parametros;
/**
 * Ejemplos de sobrecarga y escalada de constructores, paso de parámetros 
 * por valor y por referencia, objetos inmutables y bloques de inicialización
 * @author rafa
 * @version 1.0
 *
 */
public class Empleado {
	private String departamento;
	private double salarioBase;
	//bloque de inicialización instanciable
	{
		this.departamento = "Ninguno";
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase
	 * para la propiedad departamento
	 * @param departamento nombre del departamento del empleado
	 */
	public Empleado(String departamento){
		this.setDepartamento(departamento);
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase
	 * para la propiedad salarioBase
	 * @param departamento nombre del departamento del empleado
	 * @param salarioBase Salario del empleado
	 */
	public Empleado(String departamento, double salarioBase) {
		this(departamento);
		this.salarioBase = salarioBase;
	}
	public String getDepartamento(){
		return departamento;
	}
	/**
	 * Modifica el valor de la propiedad departamento,
	 * todos los nombres de departamento se guardan en mayúsculas
	 * @param departamento Nombre del departamento del empleado
	 */
	public void setDepartamento(String departamento){
		this.departamento = departamento.toUpperCase();
	}
	public void setBase(double salariobase){
		this.salarioBase = salariobase;
	}
	public double getSalarioBase() {
		return this.salarioBase;
	}
}
