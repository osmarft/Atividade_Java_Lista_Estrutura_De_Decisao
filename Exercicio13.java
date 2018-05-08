package Lista_2_Estrutura_De_Decisao;

public class Exercicio13 {
    private Double dinheiroEmCaixa;
    private int quantidadeDeProdutos;
    private Double precoDeCadaUnidade;

    public Exercicio13(Double dinheiroEmCaixa, int quantidadeDeProdutos, Double precoDeCadaUnidade) {
       setDinheiroEmCaixa(dinheiroEmCaixa);
        setQuantidadeDeProdutos(quantidadeDeProdutos);
        setPrecoDeCadaUnidade(precoDeCadaUnidade);
    }

    public Exercicio13() {
    }

    public Double getDinheiroEmCaixa() {
        return dinheiroEmCaixa;
    }

    public void setDinheiroEmCaixa(Double dinheiroEmCaixa) {
        this.dinheiroEmCaixa = dinheiroEmCaixa;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public Double getPrecoDeCadaUnidade() {
        return precoDeCadaUnidade;
    }

    public void setPrecoDeCadaUnidade(Double precoDeCadaUnidade) {
        this.precoDeCadaUnidade = precoDeCadaUnidade;
    }
    
    
    
}
