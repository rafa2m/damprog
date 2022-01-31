package dam.tematres.examen.exlog.console;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Logging en consola
 * @author rafa
 * @version 1.0
 */
public class LoggingConsole {
	public static void testLoggerConsole(){
		//se inicializa el objeto Logger
		Logger loggerConsole = LogManager.getLogger(LoggingConsole.class);
		for(int i=0;i<120;i++) {
			//se registran mensajes de nivel ERROR cada segundo
			loggerConsole.error("Error message!!!");
		}
		loggerConsole = null;
	}
}
