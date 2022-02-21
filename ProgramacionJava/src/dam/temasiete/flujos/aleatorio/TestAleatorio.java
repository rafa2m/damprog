package dam.temasiete.flujos.aleatorio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

public class TestAleatorio {

	public static void main(String[] args) {		
		Empleado[] staff = new Empleado[3];
		staff[0] = new Empleado("Juan Hacker", 35000, new Date(1989,10,1));
		staff[1] = new Empleado("Carlos Cracker", 75000, new Date(1987,12,15));
		staff[2] = new Empleado("Toñi Tester", 38000, new Date(1990,3,15));
		int i;
		try{
			DataOutputStream out = new DataOutputStream(new FileOutputStream("empleados.dat"));

			for (i = 0; i < staff.length; i++)
				staff[i].writeData(out);
			out.close();
		}catch(IOException e){
			System.out.print("Error: " + e);
			System.exit(1);
		}

		try{
			RandomAccessFile in = new RandomAccessFile("empleados.dat", "r");
			int n = (int)(in.length() / Empleado.RECORD_SIZE);
			Empleado[] newStaff = new Empleado[n];
			for (i = n - 1; i >= 0; i--){
				newStaff[i] = new Empleado();
				in.seek(i * Empleado.RECORD_SIZE);
				newStaff[i].readData(in);
			}
			for (i = 0; i < newStaff.length; i++)
				newStaff[i].print();
		}catch(IOException e){
			System.out.print("Error: " + e);
			System.exit(1);
		}

	}

}
