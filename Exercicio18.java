package Lista_2_Estrutura_De_Decisao;
/*Construa um algoritmo que leia o ano de nascimento de uma pessoa (AN) e mostre a sua
idade e, também verifique e mostre se essa pessoa já tem idade para votar (16 anos ou
mais) e se já pode conseguir a sua carteira de habilitação (18 anos ou mais).*/
public class Exercicio18 {
	private int anoNascimento;

	public Exercicio18(int anoNascimento) {
		setAnoNascimento(anoNascimento);
	}

	public Exercicio18() {
		super();
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
