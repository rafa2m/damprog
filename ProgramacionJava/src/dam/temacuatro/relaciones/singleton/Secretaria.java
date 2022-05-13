package dam.temacuatro.relaciones.singleton;

public class Secretaria {
	private String ubicacion;
	private String telefono;
	//1. Propiedad estática para almacenar la referncia del
	//único objeto de la clase
	private static Secretaria secretaria=null;
	//2. Evitar que se pueda usar el constructor por defecto
	private Secretaria() {}
	//3. Creamos un método estático que me permita construir
	//objetos y garantizar que sólo hay una instancia
	public static Secretaria getSecretaria() {
		if(Secretaria.secretaria==null)
			Secretaria.secretaria = new Secretaria();
		
		return Secretaria.secretaria;
	}

	@Override
	public String toString() {
		return "Secretaria [ubicacion=" + ubicacion + ", telefono=" + telefono + "]";
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	
}
