package dam.tematres.excepciones;

import java.util.Scanner;

public class TestCuentBancaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Titular titular = new Titular("Alejandro","12345678A");
		//excepción no comprobada
		//System.out.println(titular.getNif().substring(4,12));
		
		int numerador, denominador;
		System.out.println("Introduzca el numerador:");
		numerador = in.nextInt();
		
		System.out.println("Introduzca el denominador:");
		denominador = in.nextInt();
		
		System.out.println(numerador/denominador);
		
		System.out.println();
	}

}
