package Lista_2_Estrutura_De_Decisao;
/*Construa um algoritmo que, tendo como dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente seu peso ideal utilizando as seguintes fórmulas:
 * Para homens:* Peso ideal (P) = (72,7 * H) – 58 
 * Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7 */
public class Exercicio03 {
	private String genero;
	private Double altura;
	
	
	
	public Exercicio03() {
		
	}
	public Exercicio03(String genero, Double altura) {
		
		setGenero(genero);
		setAltura(altura);
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		
		if ( genero.equals("M") || genero.equals("F"))
			this.genero = genero;
		else 
			throw new NullPointerException(); 
		
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double calcularPesoIdeal() {
		
		if(getGenero().equals("M"))
			return ((72.7*getAltura()) - 58 );
		
		return ((62.1*getAltura()) - 44.7);
	}	
}
