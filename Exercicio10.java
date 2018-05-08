package Lista_2_Estrutura_De_Decisao;
/* Construa um algoritmo que leia dois números (A e B). Caso A seja igual a B, apresentar a
soma dos dois. Caso um seja maior que o outro, apresentar a diferença entre os dois
números (sempre lembrando que a diferença entre dois números é SEMPRE positiva). */
public class Exercicio10 {
	
	private int numeroA;
	private int numeroB;
	
	
	
	public Exercicio10() {
		
	}
	
	public Exercicio10(int numeroA, int numeroB) {
		setNumeroA(numeroA);
		setNumeroB(numeroB);
	}
	
	public int getNumeroA() {
		return numeroA;
	}
	
	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}
	
	public int getNumeroB() {
		return numeroB;
	}
	
	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	
}
