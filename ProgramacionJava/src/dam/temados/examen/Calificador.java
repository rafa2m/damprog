package dam.temados.examen;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class Calificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		int num2 = sc.nextInt();
		int iT = 0;
		/*
		 * Bucle para sacar los divisores del num1, y después dichos divisores se van sumando en iT
		 */
		for(int i=1;i<num1;i++) {
			if(num1%i==0)
				iT+=i;
		}
		if(num2==iT)
			System.out.println("Son números amigos");
		else
			System.out.println("No son números amigos");
		System.err.println("Escriba lo que sea para volver al menu...");
		sc.next();
	
	}

}
