package dam.temaseis.programacion.generica;

public class Producto {
	private EtiquetaProducto etiqueta;
	public Producto(EtiquetaProducto etiqueta) {
		this.etiqueta=etiqueta;
	}
	public EtiquetaProducto getEtiqueta() {
		return this.etiqueta;
	}
}
