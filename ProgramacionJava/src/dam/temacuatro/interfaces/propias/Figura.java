package dam.temacuatro.interfaces.propias;
/**
 * Representa a figuras de tipo 1D y 2D
 * @author rafa
 * @version 1.0
 */
public class Figura {
	/**
	 * Una figura no definida no tiene área, se define
	 * para que las clases herederas lo implementen
	 * @return Siempre 0
	 */
	public int calculaArea() {
		return 0;
	}
}
