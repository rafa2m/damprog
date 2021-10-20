package dam.temauno.tiposdatos;

import java.io.File;
/**
 * Esta clase se utiliza para ejemplos Java relacionados con tipos de datos
 * @author rafa
 *
 */
public class TiposDatos {

	public static void main(String[] args) {
		//uso de la función getClass() para obtener el nombre del tipo
		String cadena="Hola";
		String nombreTipo = cadena.getClass().getName();
		System.out.println(nombreTipo);
		//uso del operador instanceof para comprobar tipos
		boolean check1 = "1º DAM" instanceof String;
		System.out.println(check1);
		Object file=new File("prueba.txt");
		boolean check2 = file instanceof String;
		System.out.println(check2);
		//wrappers
		Double distanciaDouble=2345.4566;
		//tipo de datos primitivo, double (doble precisión)
		double distanciaD = 2345.4566;
	    System.out.println(distanciaDouble+distanciaD);
	}

}
