package dam.temacuatro.interfaces.propias;
/**
 * Prueba interfaces y herencia
 * @author rafa
 * @version 1.0
 */
public class TestFiguras {
	public static void main(String[] args) {
		//todo círculo es una figura por 
		//la herencia
		Figura figura = new Circulo(3);
		//el método calculaArea es heredado e implmentado por Circulo
		System.out.println(figura.calculaArea());
		
		Cuadrado cuadrado = new Cuadrado(3);
		//el método dibujar() lo implementa Rectangulo a partir de la interfaz
		//Dibujable, el Cuadrado no lo implmenta usa el de Rectangulo
		cuadrado.dibujar(new Lienzo());
	}
}
