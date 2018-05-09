package Lista_2_Estrutura_De_Decisao;

public class Exercicio19 {
	private int dia;
	private int mes;
	private int ano;
	private int diaHj;
	private int anoHj;
	private int mesHj;
	public Exercicio19(int dia, int mes, int ano , int diaHj , int anoHj , int mesHj) {
		
		setDia(dia);
		setMes(mes);
		setAno(ano);
		setDiaHj(diaHj);
		setMes(mesHj);
		setAnoHj(anoHj);
	}
	public Exercicio19() {
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getDiaHj() {
		return diaHj;
	}
	public void setDiaHj(int diaHj) {
		this.diaHj = diaHj;
	}
	public int getAnoHj() {
		return anoHj;
	}
	public void setAnoHj(int anoHj) {
		this.anoHj = anoHj;
	}
	public int getMesHj() {
		return mesHj;
	}
	public void setMesHj(int mesHj) {
		this.mesHj = mesHj;
	}
	
	public int calcularIdade() {
		if (getDiaHj() >= getDia()  && getMesHj() >= getDia() )
			return ( getAnoHj() - getAno() ) ;
		else if (getMesHj() > getMes())
			return ( getAnoHj() - getAno() ) ;
		else
		return getAnoHj() - getAno() - 1;
	}
}
