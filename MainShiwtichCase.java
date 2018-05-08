
package Lista_2_estrutura_de_decisao;


import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class MainShiwtichCase {

	public static void main(String[] args) {
		boolean sair = false;
		
		while ( sair == false ) {
			try {
			
				int exercicio =Integer.parseInt( JOptionPane.showInputDialog("Lista de Exercicio Java: "
					+ "\nQual exercicio deseja Executar ?"
					+"\n(1)  (2)  (3)  (4)  (5)  (6)  (7)  (8)  (9)  (10)  (11) (12) (13) "));
				
					switch ( exercicio ) {
				
						case 1:  
							Exercicio01 ex1 = new Exercicio01();
							ex1.setValorConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua conta de Energia")));
							if (ex1.getValorConta() >= 50 )
								JOptionPane.showMessageDialog(null, "Voce esta gastando Muito", "Voce Esta Gastando Muito", JOptionPane.WARNING_MESSAGE);
							
							sair = true;
							break; 
							
						case 2:
							Exercicio02 ex2 = new Exercicio02();
							
							ex2.setValorConta(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua conta de Energia")));
							
							if (ex2.getValorConta() >= 50 ) {
								JOptionPane.showMessageDialog(null, "Voce esta gastando Muito", "Conta de Energia", JOptionPane.WARNING_MESSAGE);	
								sair = true;
								break;
							}
							
							JOptionPane.showMessageDialog(null, "Seu Gasto Esta Normal", "Conta de Energia", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
						case 3: 
							Exercicio03 ex3 = new Exercicio03();
							try {						
								ex3.setGenero(JOptionPane.showInputDialog("Qual é seu Genero: \n"+ "(M) Masculino \n" + "(F) Feminino"));
							}
							catch (java.lang.NullPointerException ex) {
								JOptionPane.showMessageDialog(null, "Digite Apenas (F) para Feminino ou (M) para Masculino", "Error", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							}
							ex3.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua Altura")));
							JOptionPane.showMessageDialog(null, "Seu Peso ideal é: " + ex3.calcularPesoIdeal() ,"Peso Ideal", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
						case 4:
							Exercicio04 ex4 = new Exercicio04();
							try {						
								ex4.setTipoCarro(JOptionPane.showInputDialog("Qual é o tipo de Combustivel que seu carro usa : \n" + "(G) Gasolina\n" + "(A) Alcool" ));
							}
							catch (java.lang.NullPointerException ex) {
								JOptionPane.showMessageDialog(null, "Digite Apenas (G) Gasolina ou (A) Alcool", "Error", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							}
							ex4.setTamanhoTanque(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a capacidade do seu Tanque")));
							JOptionPane.showMessageDialog(null, "Voçê ira gastar R$" + ex4.calcularPreçoTanqueDoCarro() + " reais para encher o tanque do seu carro", "Valor Tanque Cheio", JOptionPane.INFORMATION_MESSAGE);
							
							sair = true;
							break;
							
						case 5:
							Exercicio05 ex5 = new Exercicio05();
							
							ex5.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ")));
							JOptionPane.showMessageDialog(null, "Numero sem o sinal: " + ex5.calcularModulo(), "Retirar Sinal", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
						case 6:
							Exercicio06 ex6 = new Exercicio06();
							ex6.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Produto: ")));
							if ( ex6.getPreco() >= 50.0 && ex6.getPreco() <= 100.0)
								JOptionPane.showMessageDialog(null, "O Produto Esta em Promoção", "Preço", JOptionPane.WARNING_MESSAGE);
							else 
								JOptionPane.showMessageDialog(null, "O Produto Esta com o preço normal", "Preço", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
						
						case 7:
							Exercicio07 ex7 = new Exercicio07();
							ex7.setNomeFuncionario(JOptionPane.showInputDialog(null, "Digite o Nome do Funcionario: "));
							ex7.setSalarioFuncionario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Salario do Funcionario: ")));
							
							if ( ex7.getSalarioFuncionario() >= 1000.0 && ex7.getSalarioFuncionario() <= 5000.0 )
								JOptionPane.showMessageDialog(null, ex7.getNomeFuncionario() , "Vendedor do Mes", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
						case 8:
							Exercicio08 ex8 = new Exercicio08("osmar" , 1000.0 , "F");
							List<Exercicio08> funcionarios;
							funcionarios = new ArrayList<Exercicio08>();
							
							funcionarios.add( 1 , ex8 );
							
							
							
							sair = true;
							break;
							
						case 9:
							Exercicio09 ex9 = new Exercicio09();								
							
							ex9.setNomeFuncionario(JOptionPane.showInputDialog("Digite o nome do Funcionario: " ));
							ex9.setSalarioFuncionario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario")));
							
							if( ex9.getSalarioFuncionario() < 500 ) 
								ex9.setSalarioFuncionario(ex9.getSalarioFuncionario() * 1.15);
							else if ( ex9.getSalarioFuncionario() >= 500.0 && ex9.getSalarioFuncionario() <= 1000.0 )
								ex9.setSalarioFuncionario(ex9.getSalarioFuncionario() * 1.10);
							else
								ex9.setSalarioFuncionario(ex9.getSalarioFuncionario()*1.05);
							
							JOptionPane.showMessageDialog(null, "O valor do novo salario do funcionario é : " + ex9.getSalarioFuncionario(), "Almento de Salario", JOptionPane.INFORMATION_MESSAGE);
							
							sair = true;
							break;
							
						case 10:
							Exercicio10 ex10 = new Exercicio10();
							
							ex10.setNumeroA(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A")));
							ex10.setNumeroB(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B")));
							
							JOptionPane.showMessageDialog(null, "Resultado: "+ exercicio10(ex10.getNumeroA() , ex10.getNumeroB()), "Resultado" , JOptionPane.INFORMATION_MESSAGE);
								 
							sair = true;
							break;
						case 11:
							Exercicio11 ex11 = new Exercicio11();
							
							ex11.setCodigoLivro(JOptionPane.showInputDialog("Digite o codigo do Livro: " ));
                                                        
                                                        JOptionPane.showMessageDialog(null, exercicio11(ex11.getCodigoLivro()), "Tipo do livro", JOptionPane.INFORMATION_MESSAGE);
							
							sair = true;
							break;
						case 12:
							Exercicio12 ex12 = new Exercicio12();
							ex12.setTemperaturaTermometro(Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do termometro")));
							JOptionPane.showMessageDialog(null, "A temperatura está" + exercicio12(ex12.setTemperaturaTermometro()), "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                                                        
                                                        sair = true;
							break;
						case 13:
							Exercicio13 ex13 = new Exercicio13();
                                                        ex13.setDinheiroEmCaixa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em caixa")));
							ex13.setPrecoDeCadaUnidade(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pro produto")));
                                                        ex13.setQuantidadeDeProdutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos: ")));
                                                        Double total =ex13.getQuantidadeDeProdutos() *ex13.getPrecoDeCadaUnidade() ;
                                                        if ( total < ( ex13.getDinheiroEmCaixa() * 0.80)){  
                                                            total = total * 0.95;
                                                            JOptionPane.showMessageDialog(null, "O valor sera paga a vista, em um total de " + total);
                                                        }
                                                        else {
                                                            total = total * 1.10;
                                                            JOptionPane.showMessageDialog(null, "O valor sera paga a Prazo em 3x , em um total de " + total);
                                                        }
							sair = true;
							break;
                                                case 14:
                                                        Exercicio14 ex14 = new Exercicio14();
                                                        ex14.setValorPorHoraTrabalhada(Double.parseDouble(JOptionPane.showInputDialog("Digite da hora trabalhada")));
                                                        ex14.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ")));
                                                        Double salarioBrutoEINSS = (ex14.getHorasTrabalhadas() * ex14.getValorPorHoraTrabalhada()* 0.89);
                                                        JOptionPane.showMessageDialog(null,"O valor do salario liquido é de : " + exercicio14(salarioBrutoEINSS));
                                                        sair = true;
                                                        break;
                                                case 15:
                                                        Exercicio15 ex15 = new Exercicio15();
                                                        ex15.setValorPorHoraTrabalhada(Double.parseDouble(JOptionPane.showInputDialog("Digite da hora trabalhada")));
                                                        ex15.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ")));
                                                        salarioBrutoEINSS = (ex15.getHorasTrabalhadas() * ex15.getValorPorHoraTrabalhada() * 0.89);
                                                        JOptionPane.showMessageDialog(null, "O valor do salario liquido é de : " + exercicio15(salarioBrutoEINSS));
                                                        sair = true;
                                                        break;
                                                case 16:
                                                        Exercicio16 ex16 = new Exercicio16();
                                                        ex16.setPrecoEtiqueta(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco da etiqueta")));
                                                        ex16.setCodigoPagamento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo da Etiqueta: ")));
                                                        JOptionPane.showMessageDialog(null, "O valor do produto sera de : " + exercicio15(ex16.getPrecoEtiqueta() , ex16.getCodigoPagamento()));
                                                        sair = true;
                                                        break;
						default:
							JOptionPane.showMessageDialog(null,"Você tem que digitar um valor entre 1 e 25");
							sair = true;
							break;
							
					}
			}
			
			catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Digite apenas valores numericos entre 1 e 25 .");
				
				
			}

		}
	
		
	
	}
	
	private static int exercicio10(int numeroA, int numeroB) {
		
		if( numeroA == numeroB ) {
			return numeroA + numeroB;
			
		}
		else if ( numeroA > numeroB ) {
			return numeroA - numeroB;
			
		}
		
		return numeroB - numeroA;
			
	         
		
	}
        private static String exercicio11(String codigo) {
            if( codigo.equals("A"))
                return "Ficção";
            if (codigo.equals("B"))
                return "Não Ficção";
            return "Inválido";    
        }
        private static String exercicio12(Double temperatura) {
            if ( temperatura < 100 )
                return " muito Baixa";
            else if ( temperatura >= 100 && temperatura <= 200 )
                return " baixa";
            else if (  temperatura > 200 && temperatura < 500  )            
                return " normal";
            return " Muito Alta";      
        }
        private static Double exercicio14(Double salarioBruto){
            if (salarioBruto <= 1257.12)
                return salarioBruto;
            else if ( salarioBruto > 1257.12 && salarioBruto <= 2512.08 )
                return salarioBruto*0.85;
            return salarioBruto * 0.725;
        }
        private static Double exercicio15(Double salarioBruto){
            if (salarioBruto <= 800.45)
                return salarioBruto * 0.9235;
            else if ( salarioBruto > 800.45 && salarioBruto <= 900.0 )
                return salarioBruto*0.9135;
            else if ( salarioBruto> 900.0 && salarioBruto <= 1334.07)
                return salarioBruto*0.91;
            else if ( salarioBruto > 1334.07 && salarioBruto <= 2668.15 )
                return salarioBruto*0.89;
            return salarioBruto - 293.50;
        }
        
        private static Double exercicio16(Double valorEtiqueta, int codigoEtiqueta){
            if (codigoEtiqueta == 1)
                return valorEtiqueta * 0.90;
            else if ( valorEtiqueta == 2 )
                return valorEtiqueta * 0.95;
            else if ( valorEtiqueta == 3 )
                return valorEtiqueta;
            else 
                return valorEtiqueta*1.10;
            
        }

}

	



	


