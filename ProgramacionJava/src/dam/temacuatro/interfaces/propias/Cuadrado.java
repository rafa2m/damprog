package dam.temacuatro.interfaces.propias;
/**
 * Cuadrado, figura 2D que se puede dibujar y de la que se puede calcular
 * su área, perímetro, etc.
 * @author rafa
 *
 */
public class Cuadrado extends Rectangulo {
	/**
	 * Construye un cuadrado a partir del lado indicado
	 * @param lado Lado del cuadrado
	 */
	public Cuadrado(int lado) {
		super(lado,lado);
	}
}
