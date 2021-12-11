package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.5. Comprueba si el carácter
 * introducido es una letra y si está en mayúsculas o no.
 * @author rafa
 * @version 1.0
 *
 */
public class VocalConsonante {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una letra:");
		char letraEntrada=in.next().charAt(0);
		//utilizo un envoltorio para comprobar si el carácter introducido
		//es una letra o no. Después compruebo si la letra está en mayúsculas o no.
		if(Character.isAlphabetic(letraEntrada)) {
			if(Character.isUpperCase(letraEntrada))
				System.out.println("La letra introducida está en mayúscula");
			else
				System.out.println("La letra introducida está en minúsculas");
		}else {
			System.out.println("No has introducido una letra, vuelve a intentarlo");
		}
	}
}
