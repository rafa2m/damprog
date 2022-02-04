package dam.temacuatro.relaciones.asociacion;

import org.eclipse.jdt.annotation.NonNull;

public class Departamento {
	private Secretaria secretaria;
	public void setSecretaria(@NonNull Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	public Secretaria getSecretaria() {
		return secretaria;
	}
}
