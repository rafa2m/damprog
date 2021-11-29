package dam.temados.examen;
/**
 * Solución propuesta para las preguntas 4 y 5 del cuestionario del tema 2
 * @author rafa
 * @version 1.0
 */
public class Cuestionario {

	public static void main(String[] args) {
		//Analiza el siguiente trozo de código y propón otra solución, con el mismo resultado, 
		//utilizando la clase String en vez de StringBuffer (ce: d)
		//StringBuffer sb = new StringBuffer("1º DAM Java");
		//System.out.println("Antes: " +sb);
		//sb.insert(7,"Programación ");
		//System.out.println("Después: " + sb);
		String cadenaOriginal = "1º DAM Java";
		String cadenaModificada = cadenaOriginal.replace(cadenaOriginal.substring(7), "Programación");
		System.out.println(cadenaModificada);
		
		//Dada la cadena "Java es un lenguaje de programación orientado a objetos" (ce: f)
		//Escribe el método de String que consideres oportuno para extraer la subcadena 
		//"lenguaje de programación"
		//Escribe el método de String que consideres oportuno para obtener la última posición en 
		//la que aparece la letra "i"
		//Reemplaza "programación orientado a objetos" por "POO"
		cadenaOriginal = "Java es un lenguaje de programación orientado a objetos";
		System.out.println(cadenaOriginal.substring(11,35));
		System.out.println("La letra i aparece en la posición:" + cadenaOriginal.indexOf('i'));
		System.out.println(cadenaOriginal.replace("programación orientado a objetos", "POO"));
	}
}
