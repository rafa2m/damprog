package dam.temacuatro.inmutable;

public class TestInmutable {
	public static void main(String[] args) {
		String datoOriginal="Java";
		Integer numOriginal = 100;
		StringBuffer sb = new StringBuffer("Java");
		TestInmutable ti = new TestInmutable();
		ti.pruebaInmutable(datoOriginal,numOriginal);
		ti.pruebaMutable(sb);
		System.out.println(datoOriginal + "," + numOriginal + ", " + sb);
	}

	private void pruebaInmutable(String dato, Integer num) {
		dato.replace("Java","C++");
		num = 200;
	}
	private void pruebaMutable(StringBuffer dato) {
		dato.replace(0, dato.length(), "C++");
	}
}
