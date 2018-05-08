package Lista_2_Estrutura_De_Decisao;

/* Construa um algoritmo que, recebendo os valores de vendas do mês de determinado
vendedor (VM) e o nome do mesmo (NOME), apresente o nome, quando o valor da venda
estiver entre R$ 10000,00 e R$ 50000,00 (inclusive). */

public class Exercicio07 {
	protected String nomeFuncionario;
	protected Double salarioFuncionario;
	
	public Exercicio07() {
		
	}
	
	public Exercicio07(String nome , Double salario) {
		setNomeFuncionario(nome);
		setSalarioFuncionario(salario);
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
	
}
