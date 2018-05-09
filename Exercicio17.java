package Lista_2_Estrutura_De_Decisao;
/* Construa um algoritmo que tendo como dados de entrada o preço de um produto (PR) e
seu código de origem (CO), apresente o preço e a sua procedência, de acordo com a tabela
abaixo: */
public class Exercicio17 {
	private Double precoProduto;
	private int codigoProduto;
	
	public Exercicio17(Double precoProduto, int codigoProduto) {
		
		setPrecoProduto(precoProduto);
		setCodigoProduto(codigoProduto);
	}
	
	public Exercicio17() {
		super();
	}
	
	public Double getPrecoProduto() {
		return precoProduto;
	}
	
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	
}
