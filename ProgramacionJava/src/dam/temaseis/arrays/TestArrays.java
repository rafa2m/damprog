package dam.temaseis.arrays;
/**
 * Arrays regulares en Java, inicialización, indexación y acceso
 * @author rafa
 * @version 1.0
 */
public class TestArrays {
	public static void main(String[] args) {
		//inicialización, los elementos del array no están inicializados explícitamente,
		//su valor lo toman del tipo
		int[] edades = new int[5];
		//inicialización, se define el número de elementos del array y se inicializan
		//a los valores indicados
		int[] salarios = {1,2,3,4};
		
		for(int i=0;i<edades.length;i++)
			System.out.println(edades[i]);
		
		for(int i=0;i<salarios.length;i++)
			System.out.println(salarios[i]);
		
	}
}
