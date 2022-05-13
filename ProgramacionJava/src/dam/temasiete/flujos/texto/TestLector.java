package dam.temasiete.flujos.texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * Plantilla para realizar la actividad 7.2
 * Leer un fichero de datos de tipo texto y volcar cada línea
 * a un ojbeto del tipo Empleado{@link Empleado} Cada objeto se debe guardar en un
 * array de empleados, que finalmente se recorrerá y se mostrarán
 * los datos de cada empleado
 * @author rafa
 * @version 1.0
 */
public class TestLector {	
	public static void main(String[] args) {
		BufferedReader reader=null;
		File file = new File("empleados.txt");
		TestLector testLector = null;
		Empleado[] empleados = null;
		int i=0;
		//si el fichero no existe o está vacío terminamos el programa
		if(!file.exists() || (file.exists() && file.length()==0))
			System.exit(-1);

		//si llego aquí significa que el fichero existe y no está vacío		
		//abrir el flujo de entrada sobre el fichero indicado
		try {			
			reader=new BufferedReader(new FileReader(file));			
			//lo siguiente se puede usar cuando las líneas del fichero tienen longitud
			//fija
			//empleados = new Empleado[(int)file.length()/line.length()];

			empleados = new Empleado[1000];

			testLector = new TestLector();
			//leer el fichero línea a línea e instanciar objetos de la clase Empleado
			String line=null;
			
			while((line=reader.readLine())!=null) {
				empleados[i++]=testLector.juliana(line);
			}			
			for(Empleado empleado:empleados) {
				System.out.println(empleado);
			}

		}catch (FileNotFoundException e) {
			//tratar el error cuando el fichero no existe
		}catch(IOException e) {	
			//tratar errores genéricos de entrada y salida
			e.printStackTrace();
		} finally {
			if(reader!=null)
				try {
					reader.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}			
		//guardara cada objeto de la clase Empleado en el array de Empleados

		//recorrer el array de Empleados mostrar sus datos en consola
	}
	/**
	 * Separa los datos de la línea teniendo en cuenta que el carácter 
	 * separador es la coma
	 * @param line Línea con los datos de un empleado
	 * @return Objeto de la clase Empleado
	 */
	private Empleado juliana(String line) {
		Empleado empleado;
		String[] campos;
		int i=0;
		StringTokenizer st = new StringTokenizer(line,",");
		campos = new String[st.countTokens()];
		//nif,nombre,sueldo,edad,baja
		//nif
		while(st.hasMoreTokens()) {
			campos[i++] = st.nextToken();
		}
		empleado = new Empleado(campos[0],
				campos[1],Integer.valueOf(campos[3]),
				Float.valueOf(campos[2]),
				Boolean.valueOf(campos[4]));

		return empleado;
	}
	private Empleado juliana(String line, char separator) {
		return null;
	}
}
