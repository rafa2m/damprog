package dam.temaseis.arraylists;

public class Empleado {
	private String nombre;
	private String nif;
	public Empleado(String nombre, String nif) {	
		this.nombre = nombre;
		this.nif = nif;
	}
	
	@Override
	public boolean equals(Object obj) {
		//nulidad
		if(obj==null) return false;
		//el tipo
		if(!(obj instanceof Empleado)) return false;
		//comparo por nif
		if(this.nif.equals(((Empleado)obj).nif)) return true;
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}	
}
