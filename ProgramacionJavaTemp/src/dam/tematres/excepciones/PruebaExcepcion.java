package dam.tematres.excepciones;

public class PruebaExcepcion {
	public static void main(String[] args) {
		PruebaExcepcion pe = new PruebaExcepcion();					
		
		try {
			pe.leerLinea(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String leerLinea(String buffer) throws RedNoDisponible{
		if(buffer==null) {
			/*comprobación deprecondición*/
			throw new RedNoDisponible("Has pasado un nulo como parámetro"); 			 
		}
		return buffer;
	}
}
