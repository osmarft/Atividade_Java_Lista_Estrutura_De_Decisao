package Lista_2_Estrutura_De_Decisao;

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
							
							
							
							sair = true;
							break;
						case 12:
							Exercicio12 ex12 = new Exercicio12();
							
							sair = true;
							break;
						case 13:
														
							
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

}

	


