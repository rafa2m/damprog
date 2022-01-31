package dam.tematres.examen.exlog;

public class CuentaCorriente {
	private String nombre, apellidos, direccion, telefono, nif;
	private double saldo;
	
	public CuentaCorriente(String nombre, String apellidos, 
			String dirección, String telefono, String nif,
			double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = dirección;
		this.telefono = telefono;
		this.nif = nif;
		this.saldo = saldo;
	}
	/**
	 * Le resta al saldo una cantidad de dinero pasada como argumento.
	 * @param importe Cantidad de dinero a retirar de la cuenta
	 */
	public void sacarDinero(double importe, String nif)
	throws SaldoInsuficienteException,ClienteNoAutorizadoException{
		if(!this.nif.equals(nif))
			throw new ClienteNoAutorizadoException("No está autorizado a "
					+ " realizar esta operación.");
		
		if(importe>this.saldo) throw new SaldoInsuficienteException("Su saldo"
				+ " actual es insuficiente para la cantidad que quiere retirar"
				+ " , su saldo disponible es: " + this.saldo);
		
		this.saldo-=importe;
	}
	/**
	 * le añade al saldo una cantidad de dinero.
	 * @param importe a ingresar en la cuenta
	 */
	public void ingresarDinero(double importe) {
		this.saldo+=importe;
	}
	/**
	 * visualizará todos los datos de la cuenta.
	 * @return Datos de la cuenta corriente
	 */
	public String consultarCuenta() {
		return "CuentaCorriente [nombre=" + nombre + ", apellidos=" + apellidos + ", dirección=" + direccion
				+ ", teléfono=" + telefono + ", NIF=" + nif + ", saldo=" + saldo + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDirección() {
		return direccion;
	}
	public void setDirección(String dirección) {
		this.direccion = dirección;
	}
	public String getTeléfono() {
		return telefono;
	}
	public void setTeléfono(String teléfono) {
		this.telefono = teléfono;
	}
	public String getNIF() {
		return nif;
	}
	public void setNIF(String nIF) {
		nif = nIF;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
