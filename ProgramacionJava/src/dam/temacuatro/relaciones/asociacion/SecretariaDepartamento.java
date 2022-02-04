package dam.temacuatro.relaciones.asociacion;

public class SecretariaDepartamento {
	private Secretaria secretaria;
	private Departamento departamento;
	public SecretariaDepartamento(Secretaria secretaria,
			Departamento departamento) {
		this.secretaria = secretaria;
		this.departamento = departamento;
		this.departamento.setSecretaria(secretaria);
		this.secretaria.setDepartamento(departamento);
	}
}
