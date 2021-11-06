package dam.temauno.conversiones;
/**
 * Solución propuesta para la actividad 1.6
 * Explica con comentarios de código, de una o más líneas, lo siguiente:
 * @author rafa
 *
 */
public class ConversionAutomatica {

	public static void main(String[] args) {
		//inicialización de una variable de tipo byte
		byte b = 42; 
		//inicialización de una variable de tipo char
        char c = 'a'; 
        //inicialización de una variable de tipo short
        short s = 1024;
        //inicialización de una variable de tipo int
        int i = 50000;
        //inicialización de una variable de tipo float
        float f = 5.67f;
        //inicialización de una variable de tipo double
        double d = .1234;
        //inicialización de una variable de tipo double, donde se producen varias conversiones 
        //automáticas de tipo:
        //(f * b) => el resultado del producto es de tipo float
        //(i / c) => el resultado del cociente es de tipo int
        //(d * s) => el resultado del producto es de tipo double
        //float + int - double => el resultado de las operaciones aritméticas es de tipo double
        double result = (f * b) + (i / c) - (d * s);
        //se muestra el valor de la variable result, pero antes se realiza una conversión 
        //automática de double a String
        System.out.println("resultado = " + result);
	}

}
