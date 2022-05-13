package dam.temaseis.listapropia;

import java.util.LinkedList;


public class TestSort {

	public static void main(String[] args) {
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		
		Empleado empleado1 = new Empleado("Rafa","88845678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Empleado empleado3 = new Empleado("Almudena","22245678A");
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		empleados.sort(empleado1);
		
		for(Empleado e:empleados) {
			System.out.println(e);
		}
	}

}
