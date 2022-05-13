package dam.temacuatro.examen;

import java.time.LocalDate;

public final class ProductoFresco extends Producto{
	public ProductoFresco(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado,
			String paisOrigen) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen);
		this.referencia+="F";
	}
}
