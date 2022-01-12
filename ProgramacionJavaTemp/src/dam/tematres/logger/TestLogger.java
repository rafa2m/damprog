package dam.tematres.logger;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Pruebas de depuración con Logger
 * @author rafa
 *
 */
public class TestLogger {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestLogger.class.getName());
	
		Persona persona = new Persona("Antonio",
				(byte)20,"calle el suspiro verde s/n");
		
		logger.log(Level.INFO, "Trazando la información de estado de un objeto"
				+ " de personas: {0}",persona);			
	}
}
