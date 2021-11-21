package dam.temados.poo.fechahora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
/**
 * Solución propuesta para la actividad 2.9
 * @author rafa
 *
 */
public class RegionTiempo {
	public static void main(String[] args) {
		//se obtiene el instante de tiempo actual en UTC
		Instant ahora = Instant.now();
		//se crea la zona de Hongkong
		ZoneId tiempoZona = ZoneId.of("Hongkong");
		//se regionaliza el tiempo a HongKong
		System.out.println("Fecha/Hora en Hongkong:" + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));
		//se crea la zona de Kiev
		tiempoZona = ZoneId.of("Europe/Kiev");
		//se regionaliza el tiempo a HongKong
		System.out.println("Fecha/Hora en Kiev " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));
		//se crea la zona de Kiev
		tiempoZona = ZoneId.of("Atlantic/Canary");
		//se regionaliza el tiempo a Canarias
		System.out.println("Fecha/Hora en Canarias " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));
	}
}
