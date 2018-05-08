package Lista_2_Estrutura_De_Decisao;

public class Exercicio11 {

  private String codigoLivro;
   
    
   Exercicio11(){
       
   }
   Exercicio11(String codigoLivro){
       setCodigoLivro(codigoLivro);
   }
   
   public void setCodigoLivro(String codigoLivro){
       
       if( codigoLivro.equals("A") || codigoLivro.equals("B") )
       this.codigoLivro = codigoLivro;
       
   }
   public String getCodigoLivro(){
       return this.codigoLivro;
   }
  


}
