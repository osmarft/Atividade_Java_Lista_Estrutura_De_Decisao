package Lista_2_Estrutura_De_Decisao;

public class Exercicio08 extends Exercicio07{
	private String departamento;

	public Exercicio08() {
		
	}
	public Exercicio08(String nome , Double salario,String Departamento) {
		setDepartamento(Departamento);
		setNomeFuncionario(nome);
		setSalarioFuncionario(salario);
	}
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
