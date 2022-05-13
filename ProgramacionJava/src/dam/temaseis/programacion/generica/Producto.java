package dam.temaseis.programacion.generica;

import java.time.LocalDate;

public class Producto {
	private EtiquetaProducto etiqueta;
	private LocalDate caducidad;
	public Producto(EtiquetaProducto etiqueta) {
		this.etiqueta=etiqueta;
	}
	public EtiquetaProducto getEtiqueta() {
		return this.etiqueta;
	}
	/**
	 * Acontado tipos de datos genéricos en un método
	 * @param <T> Tipo genérico debe derivar de Producto
	 * @param producto Producto a copiar
	 * @return copia del subtipo de producto que se indica como parámetro
	 */
	public <T extends Producto> T copia(T producto) {		
		return producto;
	}
}
