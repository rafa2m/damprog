package dam.tematres.examen.exlog;


/**
 * Problema 2 del examen
 * Se prueba a sacar dinero de una cuenta corriente con saldo insuficiente
 * e identificación incorrecta. La finalidad es poner a prueba excepciones
 * comprobadas propias.
 * @author rafa
 * @version 1.0
 */
public class TestCuentaBancaria {
	public static void main(String[] args) {
		CuentaCorriente cuentaCorriente =
				new CuentaCorriente("Rubén","Apellidos",
						"Avda. Goya","333333333","12345678A",
						2000);
		try {
			//se prueba a sacar dinero inferior al saldo con nif correcto
			cuentaCorriente.sacarDinero(300, "12345678A");
			System.out.println(cuentaCorriente.consultarCuenta());
			//se prueba a sacar dinero superior al saldo con nif correcto
			cuentaCorriente.sacarDinero(2500, "12345678A");
			//se prueba sacar dinero suficiente con nif incorrecto
			cuentaCorriente.sacarDinero(100, "12345678B");
		} catch (SaldoInsuficienteException | ClienteNoAutorizadoException e) {
			e.printStackTrace();
		}
	}
}
