package dam.libreria.nominas;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Empleado de una empresa con nómina y contrato de trabajo
 * @author rafa
 * @version 1.0
 *
 */
public class Empleado {
	private Nomina[] nominas;
	private Contrato contrato;
	private String nombre;
	private String nif;
	private int edad;
	public Empleado(@NonNull Contrato contrato, String nombre, String nif, int edad) {		
		this.contrato = contrato;
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
		this.nominas = new Nomina[12];
	}
	public void nuevaNomina(@NonNull Nomina nomina) {
		int mes = nomina.getFecha().getMonth().getValue();
		this.nominas[mes-1]=nomina;
	}
	public Nomina[] getNominas() {
		return this.nominas;
	}
	public Nomina getNomina(int mes) {
		if(mes<0 || mes>this.nominas.length) return null;
		return this.nominas[mes-1];
	}
}
