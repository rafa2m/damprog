package dam.temaseis.examen.uno;

import java.util.Arrays;

public class ArrayDam {

	public static void main(String[] args) {		
		int[] array = {3, 2, 4, 6,7,1,4,9,5,3,1,4};
		
		int veces=0;
		Arrays.sort(array);
		
		int pos = Arrays.binarySearch(array, 9);
		
		System.out.println("La posición del valor 9 en el array es:" + pos);
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					veces++;
				}
			}
			System.out.println("El valor " + array[i] + " se repite " + veces +
					" entre las posiciones " + i + " y " + array.length);
			veces=0;
		}			
	}

}
