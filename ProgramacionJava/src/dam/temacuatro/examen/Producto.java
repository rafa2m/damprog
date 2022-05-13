package dam.temacuatro.examen;

import java.time.LocalDate;

public class Producto implements Comparable{
	private static int instancia;
	protected String referencia;
	private LocalDate fechaCaducidad;
	private int lote;
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	public Producto(LocalDate fechaCaducidad, 
			int lote) {				
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;		
		Producto.instancia++;
		this.referencia=
				Producto.instancia+""+System.currentTimeMillis();
	}
	
	public Producto(LocalDate fechaCaducidad, 
			int lote, LocalDate fechaEnvasado, 
			String paisOrigen) {			
		this(fechaCaducidad,lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;		
	}

	@Override
	public int compareTo(Object arg0) {
		return this.referencia.compareTo(arg0.toString());
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getReferencia() {
		return referencia;
	}		
}
