package dam.tematres.logger;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoggerExample {
	private String ruta;
	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	public static void main(String[] args) throws 
	SecurityException, IOException {

		LOGGER.info("Logger Name: "+ LOGGER.getName());

		LOGGER.warning("Puede producir la excepción ArithmeticException");

		Scanner sc = new Scanner(System.in);	
		System.out.println("Introduzca numerador:");
		int a = sc.nextInt();
		System.out.println("Introduzca denominador:");
		int b = sc.nextInt();
		
		LOGGER.config("Numerador=" + String.valueOf(a) 
		+ ", denominador=" + String.valueOf(b));

		try{
			System.out.println(a/b);
		}catch(ArithmeticException ex){
			LOGGER.log(Level.SEVERE, 
					"Ha ocurrido una excepción, se ha intentado dividir por 0", ex);
		}
	}
	@Override
	public String toString() {
		return "LoggerExample [ruta=" + ruta + "]";
	}
}
