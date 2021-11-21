package dam.temados.poo.caracter;

import java.util.Scanner;
/**
 * Solución propuesta para el apartado d) de la actividad 2.3
 * @author rafa
 * @version 1.0
 *
 */
public class Caracter {
	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número entero entre 0 y 255:");
		numero = in.nextInt();
		//se realiza un casting de int a char, por lo que se obtiene
		//el carácter correspondiente al número introducido
		System.out.println((numero<0 || numero>255)?
				"El número introducido no es válido":
					"El carácter que corresponde al número"
					+ " introducido es:"+(char)numero);
	}
}
