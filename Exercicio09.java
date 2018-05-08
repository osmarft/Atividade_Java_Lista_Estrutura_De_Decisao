package Lista_2_Estrutura_De_Decisao;
/* Construa um algoritmo que calcule o novo salário (SAL_NOVO) de um funcionário.
Considere que o funcionário deverá receber um reajuste de 15% caso seu salário (SAL) seja
menor que 500. Se o salário for maior ou igual a 500, mas menor ou igual a 1000, o
reajuste deve ser de 10%. Caso o salário seja maior que 1000, o reajuste deve ser de 5%. */
public class Exercicio09 {
	public String nomeFuncionario;
	public Double salarioFuncionario;
	public Exercicio09(String nomeFuncionario, Double salarioFuncionario) {
		
		setNomeFuncionario(nomeFuncionario);
		setSalarioFuncionario(salarioFuncionario);
		
	}
	public Exercicio09() {
		
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
