package dam.tematres.excepciones;
/**
 * Ejemplo de uso de pre-condiciones en parámetros y estado
 * @author rafa
 * @version 1.0
 */
public class CuentaBancaria {
	//estados posibles de una cuenta bancaria
	public static final int ACTIVA=0;
	public static final int INACTIVA=1;
	//saldo de la cuenta bancaria
	private double saldo;
	//estado de la cuenta bancaria
	private int estado;
	/**
	 * Constructor especializado en construir cuentas bancarias a partir del saldo
	 * @param saldo Importe inicial de la cuenta bancaria
	 */
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
		this.estado = ACTIVA;
	}
	/**
	 * Método para retirar fondos de la cuenta bancaria
	 * @param cantidad (Double) Importe a retirar de la cuenta
	 * @return Devuelve verdadero si la cuenta está activa y hay saldo suficiente, en caso contrario falso
	 */
	public boolean retirar(double cantidad) {
		//pre-condición de parámetro y estado
		if(cantidad >0 && cantidad<=this.saldo && this.estado==ACTIVA) {
			this.saldo -= cantidad;
			return true;
		}
		return false;
	}
	/**
	 * Método para ingresar fondos en la cuenta bancaria
	 * @param cantidad (Double) Importe a ingresar en la cuenta bancaria
	 * @return Devuelve verdadero si la cantidad a ingresar es mayor que 0 y la cuenta está activa,
	 * en caso contrario falso
	 */
	public boolean ingresar(double cantidad) {
		//pre-condición de parámetro y estado
		if(cantidad>0 && this.estado==ACTIVA)
		{
			this.saldo+=cantidad;
			return true;
		}
		return false;
	}
}
