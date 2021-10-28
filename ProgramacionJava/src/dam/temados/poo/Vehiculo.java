package dam.temados.poo;

public class Vehiculo {
	//propiedad para almacenar la potencia de los objetos de tipo automóvil
	protected int potencia;
	protected int ruedas;
	protected String marca;
	protected int color;
	protected boolean elctrico;
	protected boolean automatico;
	protected double velocidad;
	/*
	 * primer comportamiento del automóvil
	 */
	public void acelera() {
		this.velocidad+=10;
	}
	/*
	 * segundo comportamiento del automóvil
	 */
	public void frena() {
		this.velocidad-=10;
	}	
	/**
	 * Se utiliza para modificar el número de ruedas del automóvil
	 * @param ruedas Entero que contiene el número de ruedas que se asignarán al automóvil
	 */
	public void setRuedas(int ruedas) {		
		this.ruedas = ruedas<0?0:ruedas;
	}
	/**
	 * Se utiliza para obtener el número de ruedas de un automóvil
	 * @return Entero con el número de ruedas del automóvil
	 */
	public int getRuedas() {
		return this.ruedas;
	}
}
