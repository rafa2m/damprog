package dam.temados.examen;

import java.util.Scanner;

/**
 * Solución propuesta para la pregunta 1 del caso práctico del tema 2
 * 1. Escribir un programa Java que solicite una cadena de caracteres 
 * y la devuelva invertida con efecto espejo, esto es, se concatena a 
 * la palabra original su inversa, compartiendo la última letra, que 
 * hará de espejo, por lo que la palabra obtenida se lee igual hacia 
 * adelante que hacia atrás.  La palabra debe empezar con mayúsculas 
 * y terminar en mayúsculas, los demás caracteres deben estar en minúsculas. 
 * (5 puntos, ce: b)
 * Ejemplo: HolaloH
 * Para realizar el ejercicio puedes crear una clase denominada 
 * PalabraEspejo y responder a lo que se pide en el método main().
 * @author rafa
 *
 */
public class PalabraEspejo {
	public static void main(String[] args) {
		StringBuffer palabraSb;
		String palabra;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca una palabra en minúsculas:");
		palabra = in.next();
		//se cierra el flujo del Scanner
		in.close();
		palabraSb = new StringBuffer(palabra);
		//se concatena la palabra introducida con su inversa en la posición
		//final menos 1
		palabra = palabra.substring(0,palabra.length()-1).concat(palabraSb.reverse().toString());
		//se vuelve a inicializar el StringBuffer para las mayúsculas
		palabraSb = new StringBuffer(palabra);
		//se reemplaza el primer carácter en minúscula por mayúscula
		palabraSb.replace(0, 1, palabra.substring(0,1).toUpperCase());
		////se reemplaza el último carácter en minúscula por mayúscula
		palabraSb.replace(palabra.length()-1, palabra.length(), 
				palabra.substring(0,1).toUpperCase());
		//se muestra el resultado
		System.out.println("Palabra espejo: " + palabraSb);
	}
}
