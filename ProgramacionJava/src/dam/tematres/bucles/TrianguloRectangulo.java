package dam.tematres.bucles;
/**
 * Ejemplo de triángulo rectángulo 
 * @author rafa
 * @version 1.0
 */
public class TrianguloRectangulo {
	public static void main(String[] args) {
		int lado=4;
		//pregunto por el la longitud del lado
		char simbolo ='*';
		//debo mostrar el símbolo a partir de la diagonal
		//principal del cuadrado que contiene al triángulo
		//empezando por la derecha
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				if(j==(lado-i)-1 || j>=(lado-i))
					System.out.print(simbolo);
				else 
					System.out.print(" ");
			}
			System.out.println();
		}		
	}
}
