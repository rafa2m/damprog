package dam.tematres.examen.exlog;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Problema 3 del examen
 * @author rafa
 * @version 1.0
 */
public class TestLogJava {
	public static void main(String[] args) {
		String errorCode;
		Scanner sc = new Scanner(System.in);
		Logger logger = Logger.getLogger(TestLogJava.class.getName());
		System.out.print("Introduzca el código de error: ");
		errorCode = sc.next();
		//se usa el método log para pasar el código de error como 
		//parámetro en el texto del mensaje
		logger.log(Level.WARNING,"Se ha producido el error {0}", 
				errorCode);
		
		//concatenando el código error y el texto
		logger.warning("Se ha producido el error " + errorCode);
	}
}
