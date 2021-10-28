package dam.temados.poo;


public class TestAutomovil {

	public static void main(String[] args) {
		//se crea un objeto de tipo Automovil
		Automovil auto = new Automovil();
		//se modifica el número de ruedas del automóvil
		auto.setRuedas(-5);
		//se obtiene el número de ruedas del automóvil
		System.out.println(auto.getRuedas()); 
		
		
		Motocicleta moto = new Motocicleta();
		moto.setRuedas(2);
		moto.acelera();
	}

}
