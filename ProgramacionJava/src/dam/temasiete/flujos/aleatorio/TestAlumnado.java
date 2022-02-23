package dam.temasiete.flujos.aleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
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
					}else {
						System.out.println("Alumno/a con número " + numero + " se ha encontrado en el fichero");
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
				double numeroLeido = raf.readLong();
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
			raf.writeInt(alumnado.getEdad());//+4
			raf.writeInt(alumnado.getTelefono());//+4			
			raf.writeChars(alumnado.getCorreo());//+60
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void mostrarAlumnado() {
		RandomAccessFile raf=null;
		try {
			long numero;
			int edad, telefono;
			Alumnado alumnado=null;
			byte[] nombre,correo,domicilio;
			nombre = new byte[2*Alumnado.TAM_NOMBRE];
			correo = new byte[2*Alumnado.TAM_CORREO];
			domicilio = new byte[2*Alumnado.TAM_DOMICILIO];
			//abrir el flujo para leer
			raf = new RandomAccessFile(FICHERO,"r");
			//leer cada cada campo del registro y utilizar la información
			//para instanciar un objeto de la clase Alumnado
			int numRegistros = (int)raf.length()/Alumnado.TAM_REGISTRO;
			for(int i=0;i<numRegistros;i++) {				
				raf.seek(i*Alumnado.TAM_REGISTRO);
				//comienzo a leer los campos de cada registro
				numero = raf.readLong();//8 bytes
				//leo el nombre
				raf.read(nombre); //80 bytes				
				//leo domiclio
				raf.read(domicilio); //120 bytes
				//leo la edad
				edad = raf.readInt(); //4 bytes
				//leo el teléfono
				telefono = raf.readInt();				
				raf.read(correo);
				
				alumnado = new Alumnado(convertByteArray(nombre),
						convertByteArray(domicilio),edad,telefono,
						convertByteArray(correo));
				//por cada objeto anterior se invocará el método toString() para
				//mostrar información del mismo
				System.out.println(alumnado);				
			}
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			//cerrar el flujo
			if(raf!=null)
				try {
					raf.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}						
	}
	/**
	 * Convierte un array de bytes a una cadena de caracteres sin espacios antes
	 * ni al final de la misma
	 * @param campo Array de bytes a convertir
	 * @return Cadena vacío o una cadena que representa a los bytes recibidos
	 * como parámetro
	 */
	private String convertByteArray(byte[] campo) {
		String res = "";
		for(int i=0;i<campo.length;i++) {
			if(campo[i]!=0)
				res += (char)campo[i];
		}
		return res.trim();
	}
}
