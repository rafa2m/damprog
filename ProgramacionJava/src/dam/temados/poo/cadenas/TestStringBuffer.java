package dam.temados.poo.cadenas;
/**
 * Clase para probar métodos y propiedades de StringBuffer
 * @author rafa
 * @version 1.0
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		//Los objetos de StringBuffer son mutables
		StringBuffer sb = new StringBuffer("¡Hola desde Java! ");
		sb.replace(6, 11, "a");
		System.out.println(sb); //¡Hola a Java!
		
		//los objetos de String son inmutables
		String s = new String("¡Hola desde Java! ");
		s.replace("desde", "a");
		System.out.println(s); //¡Hola a Java!
	}
}
