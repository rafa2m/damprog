package dam.temasiete.flujos.aleatorio;

public class Alumnado {
	public static final int TAM_NOMBRE=40;
	public static final int TAM_DOMICILIO=60;
	public static final int TAM_CORREO=30;
	public static final int TAM_REGISTRO=2*(TAM_NOMBRE+TAM_DOMICILIO +TAM_CORREO)+16;
	public static final int TAM_NUMERO=8;
	private long numero; //milisegundos correspondientes al instante en que se crea
	private String nombre; //40 caracteres
	private String domicilio; //60 caracteres
	private int edad;
	private int telefono;
	private String correo; //30 caracteres

	public Alumnado(String nombre, String domicilio, int edad, int telefono, String correo) {		
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.numero = System.currentTimeMillis();
	}
	public String getNombre() {
		StringBuffer sb=new StringBuffer(this.nombre);
		for(int i=this.nombre.length();i<TAM_NOMBRE;i++) {
			sb.append(' ');
		}
		return sb.toString();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		StringBuffer sb=new StringBuffer(this.domicilio);
		for(int i=this.domicilio.length();i<TAM_DOMICILIO;i++) {
			sb.append(' ');
		}
		return sb.toString();
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		StringBuffer sb=new StringBuffer(this.correo);
		for(int i=this.correo.length();i<TAM_CORREO;i++) {
			sb.append(' ');
		}		
		return sb.toString();
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public long getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "Alumnado [numero=" + numero + ", nombre=" + nombre + ", domicilio=" + domicilio + ", edad=" + edad
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}	
}
