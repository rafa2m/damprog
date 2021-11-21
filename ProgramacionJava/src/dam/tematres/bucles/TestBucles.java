package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Ejemplos de bucles Java
 * @author rafa
 * @version 1.0
 */
public class TestBucles {

	public static void main(String[] args) {
		int numero=1, limite;
		Scanner in = new Scanner(System.in);
		
		//bucle de tipo while, no entra ninguna vez
		while(numero>1)
			System.out.println(numero++);			
		System.out.println(numero);

		//bucle de tipo while, se desconoce el número de iteraciones
		//puede que las instrucciones que contiene no se ejecuten ninguna vez
		numero=(int)(Math.random()*200+1);
		while(numero<100) {
			System.out.println(numero);
			//se genera un número aleatorio comprendido entre 1 y 200 y 
			//se asigna a la variable numero. Se desconoce por tanto
			//el número de veces que se va a iterar
			numero=((int)Math.random()*200+1);
		}
		//bucle infinito con while
		numero=1;
		while(true) {
			System.out.println(2*numero++);
			if(numero==10) break;
		}

		//bucle infinito con while con iteración definidas dentro de un rango
		//y selección de instrucción que se ejecutarán
		numero=0;
		while(true) {
			numero++;
			if(numero>10) break;
			if(numero%2!=0) continue;
			System.out.println(2*numero);			
		}

		//bucle do...while
		//bucle de tipo do...while, se desconoce el número de iteraciones
		//al menos una
		do {
			System.out.println(numero);
			//se genera un número aleatorio comprendido entre 1 y 200 y 
			//se asigna a la variable numero. Se desconoce por tanto
			//el número de veces que se va a iterar
			numero=(int)(Math.random()*200+1);
		}while(numero<100);
		
		int i=0;
		//for sencillo	
		for(;i<3;i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
		
		i=0;
		for(;;) {
			i++;
			if(i>10)break;
			System.out.println(i);		
		}
		
		//bucle for para números pares
		for(i=0;i<=100;i+=2)
			System.out.println(i);
	}

}
