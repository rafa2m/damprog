package dam.temacuatro.examen;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoCongelado{
	private double salinidad;
	public ProductoCongeladoAgua(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado,
			String paisOrigen, int temperatura,
			double salinidad) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperatura);
		this.salinidad = salinidad;
		this.setTipoCongelado(this);
	}
	public double getSalinidad() {
		return salinidad;
	}
	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}	
}
