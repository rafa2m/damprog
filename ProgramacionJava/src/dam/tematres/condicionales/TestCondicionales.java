package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Ejemplos de uso de la estructura de control condicional if
 * @author rafa
 *
 */
public class TestCondicionales {

	public static void main(String[] args) {
		//ejemplos de if con una o más líneas y alternativa no evaluada
		if(true) {
			System.out.println("La condición era cierta");
			System.out.println("La condición era cierta");
		}
		else
			System.out.println("Esta línea se ejecuta siempre");

		//comprobar si un número introducido por consola es menor que 0
		//mayor o igual que 0 y menor o igual que 10
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
		numero = sc.nextInt();
		if(numero<0)
			System.out.println("El número introducido es menor que 0 " + numero);
		else if(numero >-1 && numero <11) {
			System.out.println("El número introducido es mayor o igual que 0 y " + 
					"menor o igual que 10: "+ numero);
			if(numero==4)
				System.out.println("Has introducido es número " + numero);
		}
		else
			System.out.println("El número introducido no es válido: "+ numero);

		//ejemplo del operador alternativa del if anterior
		String mensaje = numero<0?"El número introducido es menor que 0 " + numero:
			(numero >-1 && numero<11)?"El número introducido es mayor o igual que 0 y " + 
			"menor o igual que 10: "+ numero:"El número introducido no es válido: "+ 
			numero;

		sc.close();
	}

}
