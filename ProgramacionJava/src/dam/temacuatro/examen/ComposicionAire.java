package dam.temacuatro.examen;

public class ComposicionAire {
	private int nitrogeno;
	private int oxigeno;
	private int dicarbono;
	private int vaporAgua;
	public ComposicionAire(int nitrogeno, int oxigeno, int dicarbono, int vaporAgua) {
		super();
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dicarbono = dicarbono;
		this.vaporAgua = vaporAgua;
	}
	protected int getNitrogeno() {
		return nitrogeno;
	}
	protected void setNitrogeno(int nitrogeno) {
		this.nitrogeno = nitrogeno;
	}
	protected int getOxigeno() {
		return oxigeno;
	}
	protected void setOxigeno(int oxigeno) {
		this.oxigeno = oxigeno;
	}
	protected int getDicarbono() {
		return dicarbono;
	}
	protected void setDicarbono(int dicarbono) {
		this.dicarbono = dicarbono;
	}
	protected int getVaporAgua() {
		return vaporAgua;
	}
	protected void setVaporAgua(int vaporAgua) {
		this.vaporAgua = vaporAgua;
	}
		
}
