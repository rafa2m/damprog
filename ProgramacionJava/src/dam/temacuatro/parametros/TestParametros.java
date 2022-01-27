package dam.temacuatro.parametros;
/**
 * Prueba de ejemplos de la clase Empleado y Nomina
 * @author rafa
 * @version 1.0
 */
public class TestParametros {
	public static void main(String[] args) {
		double salarioBase = 1000;
		Double salarioBaseEnv = new Double(salarioBase);
		Empleado e1 = new Empleado("Comercial");
		System.out.println("Antes de modificar el salario:" +
				e1.getSalarioBase());
		Nomina.calculaNomina(e1);
		/*a partir de aquí el empleado e1 tendrá como salario base 1024,45€
		 * porque se ha pasado el empleado por referencia, es un objeto*/
		System.out.println("Después de modificar el salario: " +
				e1.getSalarioBase());
		
		System.out.println("Antes de incrementar el salario:" +
				salarioBase);
		//salario base pasado por valor
		Nomina.calculaNomina(salarioBase);
		System.out.println("Después de incrementar el salario:" +
				salarioBase);
		
		System.out.println("Antes de incrementar el salario:" +
				salarioBaseEnv);
		//salario base pasado en un envoltorio, por referencia, pero inmutable
		Nomina.calculaNomina(salarioBaseEnv);
		System.out.println("Después de incrementar el salario:" +
				salarioBaseEnv);
	}
}
