package dam.temacuatro;

import dam.temacuatro.modificadores.Alumno;

public class TestModificadores {
	public static void main(String[] args) {
		//ejemplo de acceso a una clase pública desde otro paquete
		Alumno alumno = new Alumno("Lucía");
		//ejemplo de acceso a una clase con el modificador de acceso
		//predeterminado. Si se descomenta la siguiente línea
		//dará error y no encontrará la clase Persona del paquete
		//dam.temacuatro.modificadores
		//Persona persona = new Persona();
	}
}
