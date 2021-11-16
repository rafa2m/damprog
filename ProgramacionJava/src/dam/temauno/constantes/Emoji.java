package dam.temauno.constantes;
/**
 * Ejemplo de constantes relacionadas con estados de Emojis
 * @author rafa
 * @version 1.0
 */
public class Emoji {
	public static void main(String[] args) {
		//constantes para estados de Emojis
		final int CANSADO=0;
		final int TRISTE=1;
		final int FELIZ=2;
		final int DORMIDO=3;
		//variable para almacenar el estado
		int estado = CANSADO;
		//estado cansado
		System.out.println(estado);
		estado = CANSADO + TRISTE;
		//estado cansado y triste
		System.out.println(estado);
	}
}
