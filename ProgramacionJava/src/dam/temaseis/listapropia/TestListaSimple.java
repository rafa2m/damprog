package dam.temaseis.listapropia;

import dam.temaseis.collection.Empleado;
/**
 * Se prueba una lista simple propia, sin usar clases Java para ello
 * @author rafa
 * @version 1.0
 */
public class TestListaSimple {

	public static void main(String[] args) {
		ListaSimple<Empleado> listaSimple = new ListaSimple<Empleado>();
		Empleado empleado1 = new Empleado("Rafa","88845678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Empleado empleado3 = new Empleado("Almudena","22245678A");
		listaSimple.add(empleado1);
		listaSimple.add(empleado2);
		listaSimple.add(empleado3);
		System.out.println("El estado actual de la lista es:");
		while(listaSimple.hasNext())
			System.out.println((Empleado)listaSimple.next());
		
		//se elimina un empleado
		listaSimple.delete(empleado2);
		System.out.println("El estado actual de la lista es:");
		while(listaSimple.hasNext())
			System.out.println((Empleado)listaSimple.next());		
	}

}
