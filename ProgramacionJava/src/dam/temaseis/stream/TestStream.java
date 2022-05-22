package dam.temaseis.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
/**
 * Ejemplos de uso de Streams y expresiones lambda
 * @author rafa
 * @version 1.0
 */
public class TestStream {
	private Alumno[] alumnos;
	public static void main(String[] args) {
		TestStream ts = new TestStream();
		//se inicializa el array
		ts.alumnos = new Alumno[] {new Alumno("Sergio","12345678A",18,6),
				new Alumno("Pablo","22225678A",(int)20,8), new Alumno("Laura","22334455B",21,8.5)};
		
		System.out.println(ts.alumnoMayor());
		
		ts.recorrerStreamOrdenado();
		
		//TODO: incluir aquí la llamada a los métodos para probarlos
	}
	/**
	 * Recorre un stream de tipo cadena ordenado (forEach)
	 */
	public void recorrerStreamOrdenado() {
		Stream<String> pelis = Stream.of("Harry Potter", "Super Mario","Glass");
		pelis.sorted().forEach(t->System.out.println(t.
		toString()));
	}
	/**
	 * Obtiene en un nuevo stream las ciudades que empiezan por la letra indicada como parámetro
	 * @param letra Letra por la que debe empezar la ciudad (filter)
	 */
	public void ciudadesQueEmpiezanPor(char letra) {
		List<String> ciudades = Arrays.asList("Córdoba", "Sevilla", "Málaga", "Cáceres");
		Stream<String> stream = ciudades.stream().filter(s -> s.charAt(0) == letra);
		stream.sorted().forEach(t->System.out.println(t.
				toString()));
	}
	/**
	 * Obtiene un stream con las ciudades con distinto nombre (distinct)
	 */
	public void ciudadesConDistintoNombre() {
		List<String> ciudades = Arrays.asList("Córdoba", "Sevilla", "Córdoba", "Cáceres"); 
		Stream<String> stream = ciudades.stream().distinct();
		stream.sorted().forEach(t->System.out.println(t.
				toString()));
	}
	/**
	 * Obtiene un stream con 2 ciudades (limit)
	 */
	public void dosCiudades() {
		List<String> ciudades = Arrays.asList("Córdoba", "Sevilla", "Córdoba", "Cáceres"); 
		Stream<String> stream = ciudades.stream().limit(2);
		stream.sorted().forEach(t->System.out.println(t.
				toString()));
	}
	/**
	 * Obtiene un stream con dos ciudades a partir de la segunda 
	 * posición de los elementos del stream (skip)
	 */
	public void dosCiudadesEnPosicion() {
		List<String> ciudades = Arrays.asList("Córdoba", "Sevilla", "Córdoba", "Cáceres");
		Stream<String> stream = ciudades.stream().skip(2);
		stream.sorted().forEach(t->System.out.println(t.
				toString()));
	}
	/**
	 * Obtiene el alumno adulto con mayor edad
	 * @return Edad el alumno mayor (mapToInt y max)
	 */
	public OptionalInt alumnoMayor() {
		//se convierte un array a una lista
		List<Alumno> clase = Arrays.asList(alumnos);
		//se pasa la lista a un stream, se filtran los datos por el campo de edad, se obtiene
		//un segundo stream con los alumnos mayores de edad, incluyendo en el stream sólo 
		//la edad de los mayores. Después obtiene el mayor de todos
		OptionalInt mayor = clase.stream().
				filter(t ->  t.getEdad()>18).
				mapToInt(Alumno::getEdad).max();
		return mayor;
	}
	/**
	 * Obtener un nuevo stream con los nombres de ciudades todo en mayúsculas (map y upperCase)
	 */
	public void obtenerNombreCiudadesMayuscula() {
		List<String> paises = Arrays.asList("España", "Francia", "Alemania");
		//Stream cuyos elementos son los países en mayúsculas
		Stream<String> stream = paises.stream().map(String::toUpperCase);
		//la línea anterior también se puede escribir de la forma:
		//stream = paises.stream().map(t->t.toUpperCase());
		stream.sorted().forEach(t->System.out.println(t.
				toString()));
	}
	/**
	 * Obtiene un stream con las calificaciones de los alumnos (mapToDouble)
	 */
	public void calificacionesAlumnos() {
		List<Alumno> calificaciones = Arrays.asList(alumnos);
		//Stream de decimales cuyos elementos son las calificaciones de los alumnos
		DoubleStream doubleStream = calificaciones.stream().
				mapToDouble(Alumno::getCalificacion);

	}
	/**
	 * Comprueba si en el stream hay nombres de ciudades mayor de 5 caracteres (allMatch)
	 */
	public boolean nombresCiudadesLongitudMayor() {
		List<String> paises = Arrays.asList("España", "Francia", "Alemania"); 
		return paises.stream().allMatch(s->s.length()>5);
	}
}
