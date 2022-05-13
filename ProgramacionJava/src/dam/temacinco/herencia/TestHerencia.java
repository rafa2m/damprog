package dam.temacinco.herencia;

public class TestHerencia {
	private Persona[] personas;
	private int contador;
	public static void main(String[] args) {
		Persona[] personas = new Persona[3];
		Object object;
		//Persona persona = new Persona("Otra",31,"123456789A");
		Empleado empleado = new Empleado("Raúl",33,"123456789A");
		Director director1 = new Director("Ana",44,"123456789A");
		//personas[0] = persona;
		personas[0] = empleado;
		personas[1] = director1;
		
		System.out.println(personas[0]);
		System.out.println(personas[1]);
	}
	/**
	 * Programación genérica
	 * @param object
	 */
	public void aniadirPersona(Object object) {		
		if(object instanceof Persona) {
			personas[contador]=(Persona)object;	
		}
		contador++;
		System.out.println("fin");
	}
	public void aniadirEmpleado(Object object) {		
		if(object instanceof Empleado) {
			personas[contador]=(Empleado)object;	
		}
		contador++;
		System.out.println("fin");
	}

}
