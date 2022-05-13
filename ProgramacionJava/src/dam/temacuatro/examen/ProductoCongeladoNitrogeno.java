package dam.temacuatro.examen;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoCongelado {
	private String proceso;
	private int tiempoNitrogeno;
	public ProductoCongeladoNitrogeno(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado,
			String paisOrigen, int temperatura
			, String proceso, int tiempoNitrogeno) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperatura);
		this.proceso = proceso;
		this.tiempoNitrogeno = tiempoNitrogeno;
		this.setTipoCongelado(this);
	}
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	public int getTiempoNitrogeno() {
		return tiempoNitrogeno;
	}
	public void setTiempoNitrogeno(int tiempoNitrogeno) {
		this.tiempoNitrogeno = tiempoNitrogeno;
	}	
}
