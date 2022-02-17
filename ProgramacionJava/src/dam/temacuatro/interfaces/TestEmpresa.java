package dam.temacuatro.interfaces;

import java.util.Arrays;
/**
 * Ejemplos de uso de interfaces no propias, comparar y ordenar
 * elementos con Comparable. Ejemplo de reescritura de equals()
 * heredado de Object
 * @author rafa
 * @version 1.0
 *
 */
public class TestEmpresa {

	public static void main(String[] args) {
		/*Empleado[] empleados = new Empleado[3];
		empleados[0]=new Empleado("12345678A");
		empleados[1]=new Empleado("87654321D");
		empleados[2]=new Empleado("12345678A");*/

		Empleado[] empleados = {
				new Empleado("12345678A"),
				new Empleado("87654321D"),
				new Empleado("02345678C")};

		//		if(empleados[0].equals(empleados[2]))
		//			System.out.println("Son iguales");
		//		else
		//			System.out.println("Son no iguales");	
		//
		//		if(empleados[0].compareTo(empleados[1])>0) {
		//			System.out.println("El primer NIF es mayor que el segundo");
		//		}else if(empleados[0].compareTo(empleados[1])==0) {
		//			System.out.println("NIF iguales");
		//		}else {
		//			System.out.println("El primer NIF es menor que el segundo");
		//		}
		Arrays.sort(empleados);
		for(Empleado empleado:empleados) {
			System.out.println(empleado.getNif());
		}

		Descendiente[] descendientes = new Descendiente[2];
		descendientes[0] = new Descendiente();
		descendientes[1] = new Descendiente();
		//esta línea da error porque el array es de un tipo
		//de objetos que no implementa la interfaz Comparable
		TestEmpresa.sortDam(descendientes);
	}
	public static void sortDam(Comparable[] comparables) {

	}
}
