package dam.temauno.conversiones;
/**
 * Actividad 1.4
 * 1. Realiza una conversión de tipos de datos, utilizando 3 variables,
 * para el tipo entero, entero largo y decimal con simple precisión. Asigna un valor a la
 * variable entero largo, después asigna dicha variable a la variable de tipo entero y
 * finalmente asigna la variable de tipo entero largo a la variable de tipo decimal.
 * 
 * 2. Analiza el siguiente código y explica razonadamente qué ocurriría si se ejecutara
 * 
 * Actividad 1.5
 * Explica con comentarios de código, de una o dos líneas, el siguiente trozo de código:
 * 
 * 
 * @author rafa
 * @version 1.0
 */
public class ConversionManual {
	public static void main(String[] args) {
		//Actividad 1.4
		//Primer apartado
		int entero;
		long enteroLargo;
		float decimal;
		
		enteroLargo = 1000;
		//conversión explícita, el tipo destino tiene menor capacidad de representación
		entero = (int) enteroLargo;
		decimal = enteroLargo;
		
		System.out.println("enteroLargo=" + enteroLargo + ",entero=" + entero +",decimal="+decimal);
		
		//Segundo apartado
		//El código ni siquiera se podría ejecutar ya que daría fallo de compilación debido a que
		//es necesario el casting explícito de int a char
		char ch = 'c';

		int num = 88;
		//conversión explícita, el tipo destino tiene menor capacidad de representación
		ch = (char)num;
		
		//Actividad 1.5
		//declaración una variable de tipo byte
		byte b; 
		//inicialización de una variable de tipo entero
        int i = 257; 
        //inicialización de una variable de tipo decimal con doble precisión
        double d = 323.142;
        //conversión explícita de entero a byte, pérdida de representación
        b = (byte) i; 
        //se muestran los valores de las variables i y b, se realiza una conversión automática de:
        //entero a cadena y de byte a cadena
        System.out.println("i = " + i + " b = " + b);        
        //conversión explícita de decimal a byte con pérdida de precisión y representación
        b = (byte) d; 
        //se muestran los valores de las variables d y b, se realiza una conversión automática de:
        //double a cadena y de byte a cadena
        System.out.println("d = " + d + " b= " + b);
	}
}
