package dam.tematres.examen.exlog;
/**
 * Problema 1 del examen
 * Se pone a prueba un método de la clase que lanza una excepción 
 * no comprobada
 * @author rafa
 * @version 1.0
 */
public class TestNoComprobada {
	public static void main(String[] args) {
		TestNoComprobada tnc = new TestNoComprobada();
		//prueba en la que no se lanza excepción
		tnc.caracterEn("Esto es un texto de prueba", 8);
		//prueba en la que se lanza la excepción
		tnc.caracterEn("Esto es un texto", 20);
	}
	/**
	 *  Comprueba si se puede obtener el carácter en la posición indicada, 
	 *  en caso afirmativo debe devolver el carácter y 
	 *  en caso negativo debe lanzar una excepción del tipo no comprobada. 
	 * @param texto Texto en el que se busca el carácter
	 * @param pos Posición en la que se busca el carácter en el texto
	 * @return Caracter del texto en la posición indicada
	 */
	public char caracterEn(String texto, int pos) {
		if(texto.length()==0 || pos>texto.length() 
				|| pos<0)
			throw new IndexOutOfBoundsException("La posición indicada no"
					+ " permite obtener un carácter de la cadena");
		
		return texto.charAt(pos);
	}
}
