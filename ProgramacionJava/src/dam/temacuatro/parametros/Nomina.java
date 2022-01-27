package dam.temacuatro.parametros;
/**
 * Ejemplos de sobrecarga de métodos y acceso estático a los mismos.
 * @author rafa
 * @version 1.0
 */
public class Nomina {
	/**
	 * Método para obtener el salario de un empleado
	 * pasado como parámetro por referencia
	 * @param e Empleado que se pasa por referencia
	 */
	public static void calculaNomina(Empleado e)
	{
		if(e.getDepartamento().equals("Comercial")){
			e.setBase(1024.45);	
		}
	}
	/**
	 * Se incrementa el salario del empleado en un 15% a partir
	 * del parámetro pasado por valor
	 * @param salarioBase Salario base pasado por valor
	 */
	public static void calculaNomina(double salarioBase)
	{
		salarioBase*=1.15;
	}
	/**
	 * Se usa un envoltorio para poner a prueba su inmutabilidad
	 * , aunque se pasa por referencia
	 * @param salarioBase Envoltorio para probar la referencia e inmutabilidad
	 */
	public static void calculaNomina(Double salarioBase) {
		salarioBase*=1.15;	
	}
}
