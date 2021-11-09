package dam.temauno.repaso;

/**
 * Esta clase se utiliza para ejemplos sobre dudas de clase relacionadas con el tema 1
 * @author rafa
 * @version 1.0
 */
public class Repaso {

	public static void main(String[] args) {		
		boolean llueve, tengoPasta, voyAlCine;
		llueve = true;
		tengoPasta = true;
		//proposición compuesta con 1 &
		//no voy al cine porque llueve y además evalúa la segunda
		//condición, cuando no es necesario
		voyAlCine =  (!llueve & tengoPasta)?true:false;
		//proposición compuesta con 2 &, se evalúa la primera condición
		//si es falsa no continua, el resultado es falso
		voyAlCine =  (!llueve && tengoPasta)?true:false;
		//expresión condicional compuesta por 2 booleanos relacionados
		//mediante |. Se evalúa el primer booleano, si es verdadero 
		//continúa la evaluación del segundo, cuando no debería
		voyAlCine =  (tengoPasta | !llueve)?true:false;
		//expresión condicional igual a la anterior que relaciona dos
		//booleanos mediante el operador ||. Si el primer booleano
		//es verdadero no continúa con la evaluación, el resultado es verdadero
		voyAlCine =  (tengoPasta || !llueve)?true:false;
		
		//envoltorios
		Double salario = new Double(1234);
		double sal = 1234;
		//tanto el envoltorio como el tipo de datos double son tratados
		//como tipos de datos primitivos, durante la evaluación de la
		//expresión se desenvuelve el Double al tipo double y después
		//se realiza la operación
		sal += salario;
		
		System.out.println(sal); //casting automático
		//llamada al método toString(), no hay casting automático, ventaja del
		//uso de envolotorios
		System.out.println(salario); 
		
		//voyAlCine = voyAlCine & llueve
		voyAlCine &= llueve;
		//casting automático de boolean a String
		System.out.println(voyAlCine);
	}
}
