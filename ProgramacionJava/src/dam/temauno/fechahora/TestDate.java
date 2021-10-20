package dam.temauno.fechahora;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {		
		// Crear una instancia de un objeto Date invocando 
		// su constructor
		Date fechaOrigen = new Date();
		Date fechaFin = new Date("22/12/2021");			
		// Mostrar la fecha y la hora usando toString ()			
		System.out.println(fechaOrigen.toString());
		//Comprobar si una fecha es posterior a otra dada
		System.out.println(fechaFin.after(fechaOrigen));
		//Comprobar si una fecha es anterior a una fecha dada
		System.out.println(fechaOrigen.before(fechaFin));
		//obtener el día de la fecha
		System.out.println(fechaOrigen.getDate());
		//obtener el mes de la fecha
		System.out.println(fechaOrigen.getMonth());
		//obtener el año de la fecha
		System.out.println(fechaOrigen.getYear());
		//obtener la hora de la fecha
		System.out.println(fechaOrigen.getHours());
		//Obtener los minutos de la fecha
		System.out.println(fechaOrigen.getMinutes());
		//obtener los segundos de la fecha
		System.out.println(fechaOrigen.getSeconds());	
		//comparar dos fechas
		//0 si las dos fechas son iguales, -1 si la fecha que compara
		//es anterior a la fecha comparada, 1 si la fecha
		//que compara es posterior a la fecha comparada
		System.out.println(fechaFin.compareTo(fechaOrigen));
		
		//vamos a trabajar con el tipo de objeto Instant
		Instant instante = fechaOrigen.toInstant();
		System.out.println(instante.minusSeconds(24*3600).toString());
		//dentro de 30 días la fecha y hora será
		Instant instantePos = instante.plusSeconds(30*24*3600);
	}

}
