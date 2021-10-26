package dam.temauno.fechahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechaHoraLocal {
	public static void main(String[] args) {
		//declarar una variable de tipo LocalDateTime
		LocalDateTime ahora;
		//obtengo el instante actual
		ahora=LocalDateTime.now();
		System.out.println(ahora.toString());
		
		// transformación en LocalDate
		// con pérdida de la hora
		LocalDate hoy;
		hoy=LocalDate.from(ahora);
		System.out.println(hoy);
		
		//obtención de una fecha a partir de datos de la misma
		//obtengo el año de la fecha actual del sistema
		int anioactual = LocalDate.now().getYear();
		//compruebo si el parámetro de llamada al programa es nulo
		//, si lo es asigno el año actual obtenido y sino asigno el valor del parámetro
		String param = args.length>0?args[0]:String.valueOf(anioactual);
		int anio = Integer.valueOf(param);	
		System.out.println(anio);
		
		LocalDate navidad;
		navidad=LocalDate.of(anio, 12,25);
		System.out.println(navidad);
		
		//formatear una cadena a un tipo Hora
		LocalTime reloj;
		reloj=LocalTime.parse("22:45:03");
		System.out.println(reloj);
		
		//obtener una hora nueva modificando una insntate existente		
		reloj=LocalTime.parse("12:17:03");
		LocalTime nuevaHora;
		nuevaHora=reloj.withHour(9);
		System.out.println(nuevaHora);
		
		//sumar una cantidad temporal a una fecha para obtener una nueva fecha
		LocalDate pascua;
		pascua=LocalDate.of(anio,4,20);
		LocalDate ascension;
		ascension=pascua.plusDays(39);
		System.out.println(ascension);
		
		//construir un objeto con fecha y hora a partir de un objeto de fecha y uno de hora
		//Inicialización de la variable para la fecha
		LocalDate diaPartido=LocalDate.of(anio,7,13);
		//Declaración y asignación de la variable para la hora
		LocalTime horaPartido;
		horaPartido=LocalTime.of(21,00);
		//Declaración y asignación de variable para la fecha y hora
		LocalDateTime fin;
		//se usa la función atTime para añadir la hora al objeto de tipo fecha y hora
		fin=diaPartido.atTime(horaPartido);
		System.out.println(fin);
		
		//obtención de objetos de tipo fecha y hora
		LocalTime instanteActual = LocalDateTime.now().toLocalTime();
		LocalDate fechaActual = LocalDateTime.now().toLocalDate();
		System.out.println(fechaActual.getDayOfWeek().getValue());
	}
}
