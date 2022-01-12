package dam.tematres.excepciones;

public class MultiCatch {

	public static void main(String[] args) {		
		int num=10, den=0;
		int[] edades= {20,33,34,19};
		float res;
		try {
			res = num / den;
			edades[5]=edades[1]++;
			//multicatch
		}catch(ArithmeticException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
	}
}
