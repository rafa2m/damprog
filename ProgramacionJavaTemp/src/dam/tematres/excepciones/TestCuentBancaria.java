package dam.tematres.excepciones;

import java.io.IOException;
import java.util.Scanner;
/**
 * Prueba de excepciones comprobadas y no comprobadas
 * @author rafa
 * @version 1.0
 */
public class TestCuentBancaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			//excepción comprobada en el constructor de la clase Titular
			Titular titular = new Titular("Alejandro","12345678A");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//excepción no comprobada, posible división por 0
		int numerador, denominador;
		System.out.println("Introduzca el numerador:");
		numerador = in.nextInt();
		
		System.out.println("Introduzca el denominador:");
		denominador = in.nextInt();
		
		System.out.println(numerador/denominador);
		
		System.out.println();
	}

}
