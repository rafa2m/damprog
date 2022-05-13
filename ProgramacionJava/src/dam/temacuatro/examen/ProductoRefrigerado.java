package dam.temacuatro.examen;

import java.time.LocalDate;

public final class ProductoRefrigerado extends Producto{
	private String codigoSupervision;
	private int temperatura;
	public ProductoRefrigerado(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado,
			String paisOrigen,
			String codigoSupervision,
			int temperatura) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen);
		this.temperatura = temperatura;
		this.codigoSupervision = codigoSupervision;
		this.referencia+="R";
	}
	public String getCodigoSupervision() {
		return codigoSupervision;
	}
	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}		
}
