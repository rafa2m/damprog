package dam.temacuatro.relaciones.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Secretaria secretaria1 = Secretaria.getSecretaria();
		secretaria1.setTelefono("123456789");
		secretaria1.setUbicacion("IES Antonio Gala");
		//ya no se pueden crear más objetos de tipo secretaría
		//se obtiene el objeto anterior
		Secretaria secretaria2 = Secretaria.getSecretaria();
		System.out.println(secretaria2);
	}

}
