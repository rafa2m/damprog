package dam.temauno.operadores;
/**
 * Solución propuesta para la actividad 1.10
 * @author rafa
 *
 */
public class OperadorAsignacion {
	public static void main(String[] args) {
		//inicialización de la variable entera numero
		int numero=0;
		//operador asignación con incremento
		numero += 2;
		System.out.println("numero+=2 =>" + numero);
		//operador asignación con producto
		numero *=4; //numero = numero *4;
		System.out.println("numero*=4 =>" + numero);
		//operador asignación con diferencia
		numero -=2; //numero = numero -1;
		System.out.println("numero-=2 =>" + numero);
		//operador asignación con división
		numero /=2; //numero = numero/3;
		System.out.println("numero/=2 =>" + numero);
		//operador asignación con resto
		numero %=2; //numero = numero % 2;
		System.out.println("numero%2 =>" + numero);
		//operador asignación con & a nivel de bit
		numero &=3;
		System.out.println("numero&=3 =>" + numero); //001 & 011 = 1
	}
}
