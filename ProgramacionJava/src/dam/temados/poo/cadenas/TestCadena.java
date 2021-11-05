package dam.temados.poo.cadenas;
/**
 * Clase para probar métodos de la clase String
 * @author rafa
 *
 */
public class TestCadena {

	public static void main(String[] args) {
		String cadena1 = "Programacion";
		String cadena2 = "programación";
		String cadena3="dam";
		//obtener el carácter en posición 4
		System.out.println(cadena1.charAt(4));
		System.out.println("Programación".charAt(4));
		
		//comparar dos cadenas
		System.out.println(cadena1.equals(cadena2));
		System.out.println(cadena1.equalsIgnoreCase(cadena2));
		//la cadena que compara es menor que la comparada
		System.out.println(cadena3.compareTo(cadena1));
		//la cadena que compara es mayor que la comparada
		System.out.println(cadena1.compareTo(cadena3));
		//son iguales
		System.out.println("dam".compareTo(cadena3));
		//comprobar si una cadena empieza por un prefijo
		System.out.println(cadena1.startsWith("ama"));
		System.out.println(cadena1.startsWith("ama",5));
		//comprobar la posición de un caracter en una cadena
		System.out.println(cadena1.indexOf('o'));
		System.out.println(cadena1.lastIndexOf('o'));
		System.out.println(cadena1.indexOf("ama"));
		//se combina startsWith con indexOf
		System.out.println(cadena1.startsWith("ama",cadena1.indexOf("ama")));
		String patron ="ama";	
		//se combina substring con indexOf y lengcadena1.replace("PHP", "Java")th
		System.out.println(cadena1.substring(cadena1.indexOf(patron),
				patron.length()+cadena1.indexOf(patron)));
		//se remplaza una cadena por otra
		cadena1= " Programación en PHP ";
		cadena2 = cadena1.replace("PHP", "Java");
		System.out.println(cadena2);
		//se eliminan los espacios al principio y final de la cadena. 
		//Se muestran las longitudes de las cadenas
		System.out.println(String.valueOf(cadena1.length()) 
				+ " " + cadena1.trim().length());
		//apartado a) de la actividad 2.3
		String escalera = "1 2 3 4 5";
		System.out.println(escalera.substring(0,1) + "\n " + 
				escalera.substring(2,3) + "\n  " + 
				escalera.substring(4,5) + "\n   " + 
				escalera.substring(6,7)+ "\n    " + 
				escalera.substring(8));
	}

}
