package dam.temaocho.escena;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;

public class Jugador implements Serializable{
	private static final long serialVersionUID = 1L;
	private int identificacion;
	private String nombre;
	private int[] posicion;
	private LocalDate fechaEntrada;
	private int edad;
	private transient Equipo equipo;

	public Jugador(int identificacion,@NonNull String nombre,@NonNull Equipo equipo) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.equipo = equipo;
	}
	public Jugador(int identificacion,@NonNull String nombre,@NonNull LocalDate fechaEntrada) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.fechaEntrada=fechaEntrada;
	}
	public Jugador(int identificacion,@NonNull String nombre,@NonNull Equipo equipo, int edad) {
		this(identificacion,nombre, equipo);	
		this.edad = edad;
	}
	public Jugador(int identificacion,@NonNull String nombre,@NonNull Equipo equipo, int edad, @NonNull LocalDate fechaEntrada) {
		this(identificacion,nombre,equipo,edad);
		this.fechaEntrada = fechaEntrada;
	}
	public Jugador(int identificacion,@NonNull String nombre,@NonNull Equipo equipo, 
			int edad, @NonNull LocalDate fechaEntrada,int[] posicion) {
		this(identificacion,nombre,equipo,edad,fechaEntrada);
		this.posicion = posicion;
	}

	private void readObject(ObjectInputStream stream)
		     throws IOException, ClassNotFoundException{
		//obtiene el valor de las propiedades del objeto en el fichero y
		//haciendo uso de la serialización las usa para inicializar
		//las propiedades correspondientes en la clase del objeto
		stream.defaultReadObject();
		//leo el nombre del equipo
		String nombreEquipo = stream.readUTF();
		//leo la antiguedad
		int antiguedadEquipo = stream.readInt();
		this.equipo = new Equipo(nombreEquipo,antiguedadEquipo);
	}
	
	private void writeObject(ObjectOutputStream stream)
		     throws IOException{
		stream.defaultWriteObject();
		stream.writeUTF(this.equipo.getNombre());
		stream.writeInt(this.equipo.getAntiguedad());
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getPosicion() {
		return posicion;
	}
	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Jugador [identificacion=" + identificacion + ", nombre=" + nombre + ", posicion="
				+ Arrays.toString(posicion) + ", fechaEntrada=" + fechaEntrada + ", edad=" + edad + "]";
	}		
}
