package dam.temacuatro.interfaces.propias;
/**
 * Figura 2D que se puede dibujar y de la que se pueden 
 * tomar medidas como el área, perímetro, etc.
 * @author rafa
 * @version 1.0
 */
public class Rectangulo extends Figura implements Dibujable {
	private int base, altura;
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public int calculaArea() {
		return this.altura*this.base;
	}
	@Override
	public void dibujar(Lienzo lienzo) {		
		System.out.println("Se ha dibujado un " + 
				this.getClass().getName());
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
