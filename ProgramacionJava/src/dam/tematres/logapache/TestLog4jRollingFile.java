package dam.tematres.logapache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dam.tematres.logapache.ficheros.Persona;
/**
 * Trazado de depuración utilizando dos loggers, uno para consola y otro para rollingfile
 * @author rafa
 * @version 1.0
 */
public class TestLog4jRollingFile {
	public static void main(String[] args) throws InterruptedException {
		//se define la propiedad de localización del fichero de configuración
		System.setProperty("log4j.configurationFile",
				"/home/rafa/git/programacion/java/ProgramacionJava/log4jsettings/log4j2_multiple.xml");
		//se inicializa el registrador
		Logger logError = LogManager.getLogger(TestLog4jRollingFile.class);
		Persona persona = new Persona("Alejandro",(byte)23);
		for(int i=0;i<120;i++) {
			//este mensaje se mostrará en consola, nivel de ERROR
			logError.error("Error message!!!");
			Thread.sleep(1000);
			//este mensaje se enviará al fichero, nivel DEBUG
			persona.logginToString();
		}
	}
}
