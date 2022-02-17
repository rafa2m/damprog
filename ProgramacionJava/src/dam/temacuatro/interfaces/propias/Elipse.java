package dam.temacuatro.interfaces.propias;
/**
 * Figura 2D que se puede dibujar y tomar medidas como 
 * el área, perímetro, etc.
 * @author rafa
 * @version 1.0
 */
public class Elipse extends Figura implements Dibujable{
	private int radioMenor,radioMayor;
	public Elipse(int radioMenor,int radioMayor) {
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	@Override
	public void dibujar(Lienzo lienzo) {
		System.out.println("Se ha dibujado un " + 
				this.getClass().getName());
	}
}
