package dam.temacuatro.interfaces.propias;
/**
 * Circulo, figura 2D que se puede dibujar y realizar medidas
 * de área, perímetro, etc.
 * @author rafa
 * @version 1.0
 */
public class Circulo extends Elipse{
	private int radio;
	public Circulo(int radio) {
		super(radio,radio);
		this.radio=radio;
	}
	public int getRadio() {
		return this.radio;
	}
	@Override
	public int calculaArea() {
		return (int) ((int)Math.pow(this.radio,2)*Math.PI);
	}	
}
