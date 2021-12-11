package dam.tematres.condicionales;

import java.util.Scanner;

/**
 * Solución propuesta para la actividad 3.6. Calcula si el año
 * introducido es bisiesto.
 * @author Rafa
 * @version 1.0
 */
public class Bisiesto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean bisiesto;
		int anio;
		//Pido por consola el año
		System.out.println("Introduzca año:");
		//Recojo el año introducido
		anio = teclado.nextInt();		
		//1. Un año es bisiesto si es múltiplo de 4
		bisiesto = (anio%4==0);
		//2. Un año deja de ser bisiesto si siendo múltiplo 4 lo es de 100
		bisiesto = (bisiesto?(anio%100!=0):bisiesto);
		//3. Un año vuelve a ser bisiesto si dándose 1 y 2, es múltiplo
		//	 de 400
		bisiesto = (!bisiesto?(anio%400==0):bisiesto);
		System.out.println("El año " + anio + (bisiesto?" es bisiesto":" no es bisiesto"));
		teclado.close();
	}
}
