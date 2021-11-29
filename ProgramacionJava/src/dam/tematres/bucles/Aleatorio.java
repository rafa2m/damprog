package dam.tematres.bucles;

import java.util.Random;
/**
 * Ejemplos para la generación de números aleatorios
 * @author rafa
 * @version 1.0
 */
public class Aleatorio {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		//generación de un número aleatorio entre 1 y 1000 inclusives con Random
		System.out.println(aleatorio.nextInt(1000)+1);
		//generación de un número aleatorio entre 1 y 1000 inclusives con Math.random()
		System.out.println((int)(Math.random()*1000+1));
	}
}
