package dam.temaseis.examen.siete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExpRegular {
	public static void main(String[] args) {
		int veces=0;
		String cadena = "a.d5d8.d(k)";
		Pattern pattern = Pattern.compile(".*[;:\\)(\\.].*");
				
		
		Matcher matcher = pattern.matcher(cadena);
		if(matcher.find())
			System.out.println("La cadena " + cadena +
					" contiene alguno de los caracteres:;,:,(,) o .");
		else
			System.out.println("La cadena " + cadena +
					" NO contiene alguno de los caracteres:;,:,(,) o .");
		
		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher(cadena);
		while(matcher.find()) {
			veces++;
		}
		System.out.println("La cadena " + cadena + 
				" tiene " + veces + " dígitos");
	}
}
