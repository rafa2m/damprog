package dam.temados.ejemplosexamen;
/**
 * Ejemplo de uso de miembros estáticos y creación de instancias de objetos
 * @author rafa
 * @version 1.0
 */
public class TestEmpleado {
	public static void main(String[] args) {		
		Empleado empleado = new Empleado("11121111","12345678A");
		System.out.println(empleado.getNumero());
		System.out.println(Empleado.empleados());
	}
}
