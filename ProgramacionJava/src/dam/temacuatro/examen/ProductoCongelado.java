package dam.temacuatro.examen;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	public static final int CONGELADO_AIRE=0;
	public static final int CONGELADO_AGUA=1;
	public static final int CONGELADO_NITROGENO=2;
	private int temperatura;
	private int tipoCongelado;
	public ProductoCongelado(LocalDate fechaCaducidad, int lote, 
			LocalDate fechaEnvasado,
			String paisOrigen
			,int temperatura) {
		super(fechaCaducidad, lote, fechaEnvasado, paisOrigen);
		this.temperatura = temperatura;
		this.referencia+="C";
	}
	protected int getTemperatura() {
		return temperatura;
	}
	protected void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	protected void setTipoCongelado(Producto congelado) {
		if(congelado instanceof ProductoCongeladoAire)
			this.tipoCongelado = CONGELADO_AIRE;
		else if(congelado instanceof ProductoCongeladoAgua)
			this.tipoCongelado = CONGELADO_AGUA;
		else if(congelado instanceof ProductoCongeladoNitrogeno)
			this.tipoCongelado = CONGELADO_NITROGENO;
	}
}
