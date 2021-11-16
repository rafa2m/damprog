package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Compara los tres decimales de dos números introducidos por consola
 * @author rafa
 * @version 1.0
 */
public class ComparaTresDecimales {
	public static void main(String[] args) {
		float num1, num2;	
		Scanner sc = new Scanner(System.in);
		
		//se piden los números por consola
		System.out.println("Introduzca un número con tres decimales:");
		num1=sc.nextFloat();
		System.out.println("Introduzca otro número con tres decimales:");
		num2=sc.nextFloat();
		//se comprueba si los números introducidos tienen los mismos decimales
		if(num1-(long)num1==num2-(long)num2){
			//Se calcula la posición de la coma y se muestran los decimales
			String decimales=String.valueOf(num1);
			System.out.println("Los números introducidos tienen los mismos"
					+ " decimales: " + decimales.substring(decimales.indexOf("."),
							decimales.indexOf(".")+4));
		}else
			System.out.println("Los números introducidos NO tienen los mismos"
					+ " decimales");
	}
}
