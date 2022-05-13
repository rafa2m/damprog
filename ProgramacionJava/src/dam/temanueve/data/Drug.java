package dam.temanueve.data;

import java.util.Comparator;
import java.util.Objects;
/**
 * Clase para manejar registros de la tabla de medicamentos
 * @author rafa
 * @version 1.0
 */
public class Drug implements Comparator<Drug>{
	private int id;
	private String drugName;
	private String drugCompany;
	private String drugGeneric;
	private DrugType type;
	/**
	 * Constructor especializado en crear objetos de tipo Drug
	 * con todas sus propiedades
	 * @param id Identificador del medicamento
	 * @param drugName Nombre del medicamento
	 * @param drugCompany Fabricante del medicamento
	 * @param drugGeneric Compuestos genéricos del medicamento
	 */
	public Drug(int id, String drugName, String drugCompany, String drugGeneric) {		
		this.id = id;
		this.drugName = drugName;
		this.drugCompany = drugCompany;
		this.drugGeneric = drugGeneric;
	}	
	@Override
	public int hashCode() {
		return Objects.hash(drugName, id);
	}	
	@Override
	public int compare(Drug arg0, Drug arg1) {
		return arg0.getId()>arg1.getId()?1:arg0.getId()<arg1.getId()?-1:0;
	}	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drug other = (Drug) obj;
		return Objects.equals(drugName, other.drugName) && id == other.id;
	}
	@Override
	public String toString() {
		return "Drug [id=" + id + ", drugName=" + drugName + ", drugCompany=" + drugCompany + ", drugGeneric="
				+ drugGeneric + "]";
	}

	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugCompany() {
		return drugCompany;
	}
	public void setDrugCompany(String drugCompany) {
		this.drugCompany = drugCompany;
	}
	public String getDrugGeneric() {
		return drugGeneric;
	}
	public void setDrugGeneric(String drugGeneric) {
		this.drugGeneric = drugGeneric;
	}
	public int getId() {
		return id;
	}		
}
