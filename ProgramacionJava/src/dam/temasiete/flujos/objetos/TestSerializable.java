package dam.temasiete.flujos.objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) {		
		try {
			//abro un flujo de escritura de objetos
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("empleados.dat"));
			
			Empleado empleado = new Empleado("Alejandro",23,new Departamento("Programación","1ºDAM"));
			
			out.writeObject(empleado);
			
			out.close();			
			
			ObjectInputStream in = 
					new ObjectInputStream(new FileInputStream("empleados.dat"));

			empleado = (Empleado)in.readObject();
			
			System.out.println(empleado);
			
			in.close();
		} catch (IOException | ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}
