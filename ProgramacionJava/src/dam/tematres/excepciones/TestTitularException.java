package dam.tematres.excepciones;

import java.io.IOException;
/**
 * Prueba de excepción comprobada con captura de la excepción producida
 * en el constructor de la clase Titular
 * @author rafa
 * @version 1.0
 */
public class TestTitularException {
	public static void main(String[] args) {
		try {
			Titular titular = new Titular("María",null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}