package dam.temacuatro.reflexion;

import java.util.Comparator;
import java.util.Objects;

public class Tarjeta implements Comparable<Tarjeta>{
	private String numero;
	private String tipo;
	private String iban;	
	public int countTarjeta=0;
	
	public Tarjeta(String numero, String tipo, String iban) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.iban = iban;
	}	
	@Override
	public int hashCode() {
		return Objects.hash(numero.toLowerCase(),tipo.toLowerCase(),
				iban.toLowerCase());
	}
	@Override
	public int compareTo(Tarjeta arg0) {
		return this.getNumero().compareTo(arg0.getNumero());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(iban, other.iban) && Objects.equals(numero, other.numero)
				&& Objects.equals(tipo, other.tipo);
	}
	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", tipo=" + tipo + ", iban=" + iban + "]";
	}
	public String getNumero() {
		return numero;
	}
	private void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
}
