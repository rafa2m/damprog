package dam.temacuatro.examen;

import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoCongelado{
	private ComposicionAire composicionAire;
	public ProductoCongeladoAire(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado,
			String paisOrigen, int temperatura, ComposicionAire composicionAire) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperatura);
		this.composicionAire = composicionAire;
		this.setTipoCongelado(this);
	}

	public ComposicionAire getComposicionAire() {
		return composicionAire;
	}

	public void setComposicionAire(ComposicionAire composicionAire) {
		this.composicionAire = composicionAire;
	}	
}
