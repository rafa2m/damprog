package dam.temacuatro.reflexion;
/**
 * Ejemplo de expresiones Lambda e interfaces funcionales
 * @author rafa
 * @version 1.0
 */
public class TestLambda {

	public static void main(String[] args) {
		MiValor miValor; // declarar una referencia de interfaz
		// Aquí, la expresión lambda es simplemente una expresión constante.
		// Cuando se asigna a miValor, se construye una instancia de clase
		// en la que la expresión lambda implementa el método getValor() en MiValor.
		miValor=()->28.6; //Una simple expresión lambda

		// Llama a getValor(), el cual es provisto por la expresión lambda previamente asignada.
		System.out.println("Un valor constante: "+ miValor.getValor());

		// Ahora, se crea una expresión lambda parametrizada y se le asigna a una referencia MiValParam.
		// Esta expresión lambda devuelve lo recíproco de su argumento.
		MiValParam miValParam= (n)->1.0/n;

		// Llama a getValor(v) a través de la referencia miValParam.
		System.out.println("El recíproco de 4 es: "+miValParam.getValor(4.0));
		System.out.println("El recíproco de 5 es: "+miValParam.getValor(5.0));

		// Esta expresión lambda determina si un número es un divisor de otro.
		PruebaNum esDivisor=(n,d)-> (n%d) == 0;

		if(esDivisor.prueba(10,2))
			System.out.println(("2 es un Divisor de 10"));
		if(!esDivisor.prueba(10,3))
			System.out.println(("3 NO es un Divisor de 10"));
		System.out.println();

		// Esta expresión lambda devuelve true si el primer argumento es menor que el segundo.
		PruebaNum menorQue= (n,m) -> (n<m);

		if (menorQue.prueba(2,10))
			System.out.println("2 es menor que 10");
		if (!menorQue.prueba(10,2))
			System.out.println("10 NO es menor que 2");
		System.out.println();
	}
	//Interfaz funcional sin parámetros, trabaja con valor constante
	interface MiValor{
		double getValor();
	}
	//Interface funcional con un parámetro
	interface MiValParam {
		double getValor(double v);
	}
	//Interface funcional para comparar dos enteros (dos parámetros)
	interface PruebaNum{
		boolean prueba(int a, int d);
	}
}
