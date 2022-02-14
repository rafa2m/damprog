package dam.temasiete.flujos;

import java.io.File;
/**
 * Ejemplo de uso File
 * @author rafa
 * @version 10
 */
public class TestFile {
	public static void main(String[] args) {
		File[] files;
		int i=0;
		File file = new File("/home/rafa/Imágenes");
		if(file.isDirectory()) {
			files = file.listFiles();
			while(i<files.length && !files[i].isDirectory())				
				//número de iteraciones <=máximo número iteraciones
				System.out.println(files[i].getName() + "," + files[i++].length());			
		}
	}
}
