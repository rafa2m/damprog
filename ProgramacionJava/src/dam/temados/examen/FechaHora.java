package dam.temados.examen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * Solución propuesta al segundo apartado del caso práctico del tema 2
 * @author rafa
 * @version 1.0
 */
public class FechaHora {

	public static void main(String[] args) {
		String fecha="";
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce una fecha de la siguiente manera: "
				+ "dd/MM/aaaa hh:mm:ss");
		//se lee la fecha y hora introducida y se guarda en la variable fecha
		//la fecha y hora se debe introducir de la forma dd/MM/aaaa hh:mm:ss
		//se lee la línea completa incluidos los espacios
		fecha=in.nextLine();

		//se pasa la cadena a un objeto de tipo LocalDateTime
		//se construye el objeto LocalDateTime con su formato original de entrada
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");
		LocalDateTime fechaHora = LocalDateTime.parse(fecha, formato);
		
		//nombre del mes de la fecha
		System.out.println(fechaHora.getMonth().name());
		
		//nombre del día de la fecha
		System.out.println(fechaHora.getDayOfWeek().name());
		
		//Último día del año de la fecha
		LocalDate fechaUltimo = LocalDate.of(fechaHora.getYear(),12,31);
		System.out.println(fechaUltimo.getDayOfWeek().name());
		
		//Número de días para finalizar el año desde la fecha
		System.out.println(fechaUltimo.getDayOfYear()-fechaHora.getDayOfYear());
	}
}
