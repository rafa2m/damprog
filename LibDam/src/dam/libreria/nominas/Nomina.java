package dam.libreria.nominas;

import java.time.LocalDate;

import org.eclipse.jdt.annotation.NonNull;

public class Nomina {
	private Empleado empleado;
	private String nss;
	private double bruto;
	private double base;
	private double neto;
	private LocalDate fecha;
	{
		this.base = 1234;
		this.bruto = 2200;
		this.neto = this.bruto - this.base;
		this.fecha = LocalDate.now();
	}
	public Nomina(@NonNull Empleado empleado, String nss) {
		this.empleado = empleado;
		this.nss = nss;
	}
	public Nomina(@NonNull Empleado empleado, String nss, LocalDate fechaNomina) {
		this.empleado = empleado;
		this.nss = nss;
		this.fecha = fechaNomina;
	}
	public Nomina(Empleado empleado, String nss, double bruto, double base, double neto) {		
		this(empleado,nss);
		this.bruto = bruto;
		this.base = base;
		this.neto = neto;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public double getBruto() {
		return bruto;
	}
	public void setBruto(double bruto) {
		this.bruto = bruto;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getNeto() {
		return neto;
	}
	public void setNeto(double neto) {
		this.neto = neto;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public LocalDate getFecha() {
		return fecha;
	}	
}
