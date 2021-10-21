package dam.temauno.tiposdatos;

import java.io.File;
/**
 * Esta clase se utiliza para ejemplos Java relacionados con tipos de datos
 * @author rafa
 *
 */
public class TiposDatos {

	public static void main(String[] args) {
		//uso de la función getClass() para obtener el nombre del tipo
		String cadena="Hola";
		String nombreTipo = cadena.getClass().getName();
		System.out.println(nombreTipo);
		//uso del operador instanceof para comprobar tipos
		boolean check1 = "1º DAM" instanceof String;
		System.out.println(check1);
		Object file=new File("prueba.txt");
		boolean check2 = file instanceof String;
		System.out.println(check2);
		//wrappers
		Double distanciaDouble=2345.4566;
		//tipo de datos primitivo, double (doble precisión)
		double distanciaD = 2345.4566;
	    System.out.println(distanciaDouble+distanciaD);
	    
	    //solución de la actividad 1.4
	    //apartado 1
	    int var1=10; //variable de tipo entero
	    long var2=100; //variable de tipo entero largo
	    float var3=(float)12.456; //variable de tipo decimal simple presición
	    
	    var1 = (int)var2;
	    var3 = var2;	    
	    //apartado 2	    
	    char ch = 'c';
	    int num = 88;
	    //había que hacer un casting explícito
	    ch = (char)num;
	    
	    //actividad 1.5
	    //declaración de una variable de tipo byte
	    byte b; 
	    //inicialización de una variable entera
        int i = 257; 
        //inicialización de una variable decimal
        double d = 323.142;
        //casting explícito de int a byte
        b = (byte) i; 
        //salida por consola de las variables int y byte
        System.out.println("i = " + i + " b = " + b);        
        //casting explícito de double a byte
        b = (byte) d; 
        //salida por consola de las variables double y byte
        System.out.println("d = " + d + " b= " + b);
	}

}
