package dam.temacuatro.relaciones.asociacion;

import org.eclipse.jdt.annotation.NonNull;

public class Secretaria {
	private Departamento departamento;
	public void setDepartamento(@NonNull Departamento departamento) {
		this.departamento = departamento;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
}
