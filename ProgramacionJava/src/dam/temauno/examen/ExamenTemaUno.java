package dam.temauno.examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * Clase para mostrar las soluciones propuesta al examen del tema 1. Del cuestionario
 * sólo se incluyen las soluciones de las preguntas 3 y 5. Del caso práctico están los 5 apartados
 * @author rafa
 * @version 1.0
 */
public class ExamenTemaUno {

	public static void main(String[] args) {
		//Cuestionario, pregunta de lógica, tabla
		System.out.println("Cuestionario, pregunta 5, tabla");
		System.out.println("---------------------------------------");
		boolean bol1, bol2, bol3, bol4;
		//1 true,true,true,?
		bol1=bol2=bol3=true;
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("1)" + bol4);

		//2 true,true,false, ?
		bol1=bol2=true;
		bol3=false;
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("2)" + bol4);

		//3 true,false,false, ?
		bol1=true;
		bol2=bol3=false;
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("3)" + bol4);
		
		//4 false,false,false, ?
		bol1=bol2=bol3=false;		
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("4)" + bol4);
		
		//5 false,false,true,?
		bol1=bol2=false;
		bol3=true;
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("5)" + bol4);
		
		//6 false,true,true,?
		bol1=false;
		bol2=bol3=true;		
		bol4 = !(bol1 && bol2)||bol3;
		System.out.println("6)" + bol4);
		
		System.out.println("Cuestionario, pregunta 3");
		System.out.println("---------------------------------------");
		int sumador1,sumador2; 
		int contador=0;
		//debe mostrar 0, porque primero asigna y después incrementa
		sumador1 = contador++; 
		System.out.println("sumador1=" + sumador1);  
		//debe mostrar 2, porque primero incrementa y después asigna
		sumador2 = ++contador;
		System.out.println("sumador2=" + sumador2); 
				
		System.out.println("Caso práctico");
		System.out.println("---------------------------------------");
		//Caso práctico
		//Solicita una fecha por consola y comprueba si 
		//el año de la misma es bisiesto (no usar isLeapYear())
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca un fecha ");
		String fechaIntroducida = in.next();

		LocalDate fecha = LocalDate.parse(fechaIntroducida);
		int anio = fecha.getYear();
		boolean bisiesto = anio%4==0?(anio%100==0?anio%400==0:true):false;
		System.out.println(bisiesto);
		
		//2. Muestra la fecha anterior en tres formatos distintos (predeterminado, 
		//ISO estándar y uno personalizado)		
		System.out.println(fecha.toString());
		System.out.println(fecha.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(fecha.format(DateTimeFormatter.ofPattern("d MMM uuuu")));
		
		//3. Muestra el nombre del día de la semana de la fecha del punto 1 (LUNES, MARTES, ...), 
		//usa constantes para diferenciar los días de la semana.
		final int LUNES = 0;
		final int MARTES = 1;
		System.out.println(fecha.getDayOfWeek().name());
		
		//4. Si la fecha del punto 1 es anterior a la de tu fecha de cumpleaños, muestra por consola 
		//un mensaje indicando que la fecha no es válida, en caso contrario, muestra el número de días transcurridos desde la fecha del punto 1 y tu fecha de cumpleaños.
		LocalDate cumple = LocalDate.parse("1989-11-03");
		long dias = cumple.until(fecha,ChronoUnit.DAYS);
		String mensaje = dias<0?"La fecha introducida no es válida":String.valueOf(dias);
		System.out.println(mensaje);
				
		//5. Utiliza el operador unario de la suma (++) sobre el mes de la fecha del punto 1, 
		//para mostrar la diferencia de usar dicho operador en posición infija o postfija.	
		int mes = fecha.getMonth().getValue();
		//primero incrementa y luego asigna
		int siguienteMes = ++mes;
		System.out.println(siguienteMes);
		mes = fecha.getMonth().getValue();
		//primero asigna y luego incrementa
		siguienteMes = mes++;
		System.out.println(siguienteMes);
	}

}
