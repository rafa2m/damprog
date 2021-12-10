package dam.tematres.bucles;

import java.util.Scanner;

/**
 * Ejemplo de bucles anidados, letra Z con asteriscos
 * @author rafa
 * @version 1.0
 */
public class Zeta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tam = in.nextInt();
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				if(i==0 || i==tam-1)
					//se imprime un * en todas las columnas, primera y última fila
					System.out.print("*");
				else if(j==tam-1-i)
					//se imprime un * en todas las filas, pero sólo para aquellas
					//columnas que su índice coíncida con tam-1-i
					System.out.print("*");
				else
					//se imprime un espacio en blanco para todas las filas y columnas
					//que no cumplan lo anterior
					System.out.print(" ");
			}
			//cambio de fila
			System.out.println();
		}
	}
}
