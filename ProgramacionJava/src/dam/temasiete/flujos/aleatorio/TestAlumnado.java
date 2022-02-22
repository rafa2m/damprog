package dam.temasiete.flujos.aleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class TestAlumnado {
	private final String FICHERO="alumnado.dat";
	public static void main(String[] args) {		
		TestAlumnado testAlumnado = new TestAlumnado();
		testAlumnado.menu();
	}
	private void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		long numero=0;
		while(opcion!=5) {
			System.out.println("1. Buscar un alumno/a por su número");
			System.out.println("2. Dar de baja, eliminar datos del alumno elegido");
			System.out.println("3. Mostrar datos de todos los alumnos");
			System.out.println("4. Alta de un alumno/a");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				//comprobar si el fichero está vacío
				File file = new File(FICHERO);
				if(file.exists() && file.length()>0) {
					//pedir el número por consola
					System.out.println("Introduzca el número del alumno/a a buscar:");
					numero = sc.nextLong();
					if(!this.buscarAlumnado(numero)) {
						System.out.println("El alumno/a con número " + numero + " no se encuentra");
					}
				}else {
					System.out.println("No hay alumnos/as registrados");
				}
				break;
			case 2:
				this.eliminarAlumnado(numero);
				break;
			case 3:
				this.mostrarAlumnado();
				break;
			case 4:
				this.aniadirAlumnado();
				break;
			case 5:
				break;
			}
		}
	}
	private boolean buscarAlumnado(long numero) {
		try {
			RandomAccessFile raf = new RandomAccessFile(FICHERO,"r");
			int pos=0;
			boolean encontrado = false;
			//obtengo el número de registros
			int numRegistros = (int)raf.length()/Alumnado.TAM_REGISTRO;

			while(pos<numRegistros && !encontrado) {				
				double numeroLeido = raf.readDouble();
				if(numeroLeido==numero) encontrado=true;
				else {
					pos++;
					raf.seek(pos*Alumnado.TAM_REGISTRO-Alumnado.TAM_NUMERO);								
				}
			}
			return encontrado;
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return false;
	}
	private void leerDatosAlumnado() {

	}
	private void eliminarAlumnado(long numero) {

	}
	private void aniadirAlumnado() {
		try {			
			RandomAccessFile raf = new RandomAccessFile(FICHERO,"rw");
			int numRegistros = (int)raf.length()/Alumnado.TAM_REGISTRO;
			String nombre,domicilio,correo;
			int edad,telefono;
			Scanner sc = new Scanner(System.in);
			//posicionar el puntero de escritura-lectura al final del fichero
			raf.seek(numRegistros*Alumnado.TAM_REGISTRO);
			
			System.out.println("Introduzca nombre:");
			nombre = sc.nextLine();
			System.out.println("Introduzca domicilio:");
			domicilio = sc.nextLine();
			System.out.println("Introduzca correo:");
			correo = sc.next();
			System.out.println("Introduzca edad:");
			edad = sc.nextInt();
			System.out.println("Introduzca teléfono:");
			telefono = sc.nextInt();
			Alumnado alumnado = new Alumnado(nombre,domicilio,edad,telefono, correo);
			
			raf.writeLong(alumnado.getNumero());//+8
			raf.writeChars(alumnado.getNombre());//+80
			raf.writeChars(alumnado.getDomicilio());//+120
			raf.write(alumnado.getEdad());//+4
			raf.write(alumnado.getTelefono());//+4
			raf.writeChars(alumnado.getCorreo());//+60
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void mostrarAlumnado() {

	}
}
