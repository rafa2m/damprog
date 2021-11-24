package dam.temados.ejemplosexamen;
/**
 * Clase para el ejemplo de uso de métodos y propiedades estáticas
 * @author rafa
 * @version 1.0
 */
public class Empleado {
	private String nss;
	private String nif;
	private double salario;
	private long numero;
	private static long instancia=0;
	
	/**
	 * Constructor específico para crear empleados con nss y nif
	 * @param nss Número de la seguridad social, en una cadena
	 * @param nif Número de idenficación fiscal, en una cadena
	 */
	public Empleado(String nss, String nif) {		
		this.nss = nss;
		this.nif = nif;
		this.numero = ++Empleado.instancia;
	}
	/**
	 * Obtiene el número de instancias de la clase que se han creado
	 * @return Devuelve un número entero con los empleados creados
	 */
	public static long empleados() {
		return Empleado.instancia;
	}
	
	/**
	 * Incentiva al empleado incrementado su salario en un porcentaje
	 * pasado como parámetro 
	 * @param incentivo Número entero con el porcentaje de incremento del salario
	 */
	public void incentivar(short incentivo) {
		this.salario = this.salario * (1+incentivo/100);
	}
	
	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public long getNumero() {
		return numero;
	}	
}
