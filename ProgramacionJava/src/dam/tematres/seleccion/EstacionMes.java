package dam.tematres.seleccion;

import java.util.Scanner;

/**
 * Solución propuesta para la actividad 3.7
 * Esta clase pide un número correspondiente a un mes del 
 * año y devuelve la estación a la que pertenece ese mes
 * @author Rafa
 * @version 1.0
 */
public class EstacionMes {

	/**
	 * Esta es la clase principal del programa así como su punto de inicio.
	 * @param args
	 */
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero de mes: ");
		byte mes = sc.nextByte();
		//a partir del mes introducido se obtiene la estación correspondiente
		switch (mes) {
		case 1:case 2:case 3:
			System.out.println("Su mes se encuentra en invierno.");
			break;

		case 4:case 5:case 6:
			System.out.println("Su mes se encuentra en primavera.");
			break;

		case 7:case 8:case 9:
			System.out.println("Su mes se encuentra en verano.");
			break;

		case 10:case 11:case 12:
			System.out.println("Su mes se encuentra en otoño.");
			break;

		default:
			System.out.println("El número introducido debe estar complendido entre 1 y 12 inclusive.");
			break;
		}
		sc.close();
		System.exit(0);
	}
}