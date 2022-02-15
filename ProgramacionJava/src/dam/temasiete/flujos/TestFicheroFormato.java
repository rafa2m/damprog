package dam.temasiete.flujos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class TestFicheroFormato {

	public static void main(String[] args) {
		PrintWriter printWriter = null;
		Empleado empleado = new Empleado("12345678A",				
				"Rafa",33,2000f,false);
		try {
			printWriter = new PrintWriter("empleados.dat");
			printWriter.print(empleado.getNif());
			printWriter.print(empleado.getNombre());
			printWriter.print(empleado.getEdad());
			printWriter.print(empleado.getSueldo());
			printWriter.print(empleado.isBaja());			
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {
			if(printWriter!=null)
				printWriter.close();
		}
		File file = new File("empleados.dat");
		System.out.println(file.length());
		System.out.println(empleado.getRecordSize());		
	}

}
