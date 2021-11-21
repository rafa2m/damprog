package dam.tematres.seleccion;

import java.util.Scanner;
/**
 * Ejemplos de uso de switch. A partir de Java 12 se introducen cambios en esta estructura
 * de control de selección. Son los siguiente:
 * - Casos multivaluados
 * - Devolver valores por medio de break(esto ha sido reemplazado por yield a partir de Java 13)
 * - Devolver valores por medio de ->
 * @author rafa
 *
 */
public class TestSwitch {

	public static void main(String[] args) {
		int numero;		
		String resultado;
		Scanner in=new Scanner(System.in);
		//switch clásico
		System.out.println("Introduzca un número:");
		numero=in.nextInt();
		switch (numero) {
		case 1:
		case 2:
			resultado = "numero puede haber sido 1 o 2";
			break;
		case 3:
			resultado = "numero=3";
			break;
		case 4:
		case 5:
		case 6:
			resultado = "numero puede haber sido 4,5 o 6";
			break;
		default:
			resultado = "el valor de numero no tiene ningún caso programado";
		};

		//igual que el anterior pero con casos multivaluados (se escribe menos)
		switch (numero) {
		case 1,2:
			resultado = "numero puede haber sido 1 o 2";
		break;
		case 3:
			resultado = "numero=3";
			break;
		case 4,5,6:
			resultado = "numero puede haber sido 4,5 o 6";
		break;
		default:
			resultado = "el valor de numero no tiene ningún caso programado";
		};

		//devolviendo un valor
		resultado = switch (numero) {
		case 1,2 -> "numero puede haber sido 1 o 2";
		case 3 -> "numero=3";
		case 4,5,6 -> "numero puede haber sido 4,5 o 6";
		default -> "el valor de numero no tiene ningún caso programado";
		};
	}

}
