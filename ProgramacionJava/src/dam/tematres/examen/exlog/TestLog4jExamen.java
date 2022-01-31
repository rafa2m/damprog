package dam.tematres.examen.exlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dam.tematres.examen.exlog.console.LoggingConsole;
/**
 * Ejemplo de depuración con log4j, se carga la localización del fichero
 * con la configuración de log4j como propiedad del sistema. Después se inicializa
 * el Logger y se muestran mensajes de error cada 1s. El fichero de configuración
 * de log4j utiliza un RollingFileAppender, cada minuto se crea un fichero nuevo.
 * Después se cambiará el fichero de configuración de log4j para utilizar RollingFileAppender
 * y crear un nuevo fichero de log cada 1KB
 * @author rafa
 * @version 1.0
 */
public class TestLog4jExamen {
	public static void main(String[] args) throws InterruptedException {
		//se define la propiedad de log4j que almacena la localización del fichero
		//de configuración que se va a utilizar
		System.setProperty("log4j.configurationFile",
				"/home/rafa/git/programacion/java/ProgramacionJava/log4jsettings/log4j2_examen.xml");
		//logging en fichero
		testLoggerFile();
		//logging en consola
		LoggingConsole.testLoggerConsole();
	}
	public static void testLoggerFile() {
		Logger loggerFile = LogManager.getLogger(TestLog4jExamen.class);
		for(int i=0;i<60;i++) {
			try {
				//se registran mensajes de nivel DEBUG, cada 1KB se creará un nuevo fichero de log
				loggerFile.debug("Debug message!!!");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//se muestra el contenido de la pila tras la excepción
				e.printStackTrace();
			}
		}
		loggerFile = null;
	}
}
