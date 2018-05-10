
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
					+"\n1 - 25 "));
				
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
								ex3.setGenero(JOptionPane.showInputDialog("Qual Ã© seu Genero: \n"+ "(M) Masculino \n" + "(F) Feminino"));
							}
							catch (java.lang.NullPointerException ex) {
								JOptionPane.showMessageDialog(null, "Digite Apenas (F) para Feminino ou (M) para Masculino", "Error", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							}
							ex3.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua Altura")));
							JOptionPane.showMessageDialog(null, "Seu Peso ideal Ã©: " + ex3.calcularPesoIdeal() ,"Peso Ideal", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
						case 4:
							Exercicio04 ex4 = new Exercicio04();
							try {						
								ex4.setTipoCarro(JOptionPane.showInputDialog("Qual Ã© o tipo de Combustivel que seu carro usa : \n" + "(G) Gasolina\n" + "(A) Alcool" ));
							}
							catch (java.lang.NullPointerException ex) {
								JOptionPane.showMessageDialog(null, "Digite Apenas (G) Gasolina ou (A) Alcool", "Error", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							}
							ex4.setTamanhoTanque(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual Ã© a capacidade do seu Tanque")));
							JOptionPane.showMessageDialog(null, "VoÃ§Ãª ira gastar R$" + ex4.calcularPreçoTanqueDoCarro() + " reais para encher o tanque do seu carro", "Valor Tanque Cheio", JOptionPane.INFORMATION_MESSAGE);
							
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
								JOptionPane.showMessageDialog(null, "O Produto Esta em PromoÃ§Ã£o", "PreÃ§o", JOptionPane.WARNING_MESSAGE);
							else 
								JOptionPane.showMessageDialog(null, "O Produto Esta com o preÃ§o normal", "PreÃ§o", JOptionPane.INFORMATION_MESSAGE);
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
							
							JOptionPane.showMessageDialog(null, "O valor do novo salario do funcionario Ã© : " + ex9.getSalarioFuncionario(), "Almento de Salario", JOptionPane.INFORMATION_MESSAGE);
							
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
							JOptionPane.showMessageDialog(null, "A temperatura está: " + exercicio12(ex12.getTemperaturaTermometro()), "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                                                        
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
                                JOptionPane.showMessageDialog(null,"O valor do salario liquido Ã© de : " + exercicio14(salarioBrutoEINSS));
                                sair = true;
                                break;
                        case 15:
                                Exercicio15 ex15 = new Exercicio15();
                                ex15.setValorPorHoraTrabalhada(Double.parseDouble(JOptionPane.showInputDialog("Digite da hora trabalhada")));
                                ex15.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ")));
                                salarioBrutoEINSS = (ex15.getHorasTrabalhadas() * ex15.getValorPorHoraTrabalhada() * 0.89);
                                JOptionPane.showMessageDialog(null, "O valor do salario liquido Ã© de : " + exercicio15(salarioBrutoEINSS));
                                sair = true;
                                break;
                        case 16:
                                Exercicio16 ex16 = new Exercicio16();
                                ex16.setPrecoEtiqueta(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco da etiqueta")));
                                ex16.setCodigoPagamento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo da Etiqueta: ")));
                                JOptionPane.showMessageDialog(null, "O valor do produto sera de : " + exercicio16(ex16.getPrecoEtiqueta() , ex16.getCodigoPagamento()));
                                sair = true;
                                break;
                        case 17:
                        		Exercicio17 ex17 = new Exercicio17();
                        		ex17.setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do Produto")));
                                ex17.setCodigoProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do Produto: ")));
                                
                                switch (ex17.getCodigoProduto()) {
                                case 1:
                                	JOptionPane.showMessageDialog(null, "O preço do Produto é : " + ex17.getPrecoProduto() + " , de Procêdencia do Sul", "Produto", JOptionPane.INFORMATION_MESSAGE);
                                case 2:
                                	JOptionPane.showMessageDialog(null, "O preço do Produto é : " + ex17.getPrecoProduto() + " , de Procêdencia do Sudoeste", "Produto", JOptionPane.INFORMATION_MESSAGE);
                                case 3:
                                	JOptionPane.showMessageDialog(null, "O preço do Produto é : " + ex17.getPrecoProduto() + " , de Procêdencia do Centro-Oeste", "Produto", JOptionPane.INFORMATION_MESSAGE);
                                case 4:
                                	JOptionPane.showMessageDialog(null, "O preço do Produto é : " + ex17.getPrecoProduto() + " , de Procêdencia do Norte", "Produto", JOptionPane.INFORMATION_MESSAGE);
                                case 5:
                                	JOptionPane.showMessageDialog(null, "O preço do Produto é : " + ex17.getPrecoProduto() + " , de Procêdencia do Nordeste", "Produto" , JOptionPane.INFORMATION_MESSAGE);
                                }
                                sair = true;
                        		break;
                        case 18:
                        		Exercicio18 ex18 = new Exercicio18();
                        		ex18.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu ano de Nascimento ")));
                        		JOptionPane.showMessageDialog(null, "pela sua idade Você " + exercicio18(ex18.getAnoNascimento()), "Teste de Idade", JOptionPane.INFORMATION_MESSAGE);
                        		sair = true;
                        		break;
                        case 19:
                        		Exercicio19 ex19 = new Exercicio19();
                        		ex19.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu dia de Nascimento ")));
                        		ex19.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu mes de Nascimento ")));
                        		ex19.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu ano de Nascimento ")));
                        		ex19.setDiaHj(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia Atual ")));
                        		ex19.setMesHj(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Mes Atual ")));
                        		ex19.setAnoHj(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano Atual ")));
                        		
                        		JOptionPane.showMessageDialog(null, "Você tem : " + ex19.calcularIdade(), "Idade Real", JOptionPane.INFORMATION_MESSAGE);
                        		sair = true ; 
                        		break;
                        case 20:
                        		Exercicio20 ex20 = new Exercicio20();
                        		ex20.setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Digite Lado A")));
                        		ex20.setLadoB(Double.parseDouble(JOptionPane.showInputDialog("Digite Lado B")));
                        		ex20.setLadoC(Double.parseDouble(JOptionPane.showInputDialog("Digite Lado C")));
                        		
                        		JOptionPane.showMessageDialog(null, "O triangulo é um triangulo:  " + exercicio20(ex20.getLadoA() , ex20.getLadoB() , ex20.getLadoC()), "Triangulo", JOptionPane.INFORMATION_MESSAGE);
                        		sair = true ;
                        		break;
                        case 21:
							Exercicio21 ex21 = new Exercicio21();
							ex21.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade:  ")));
							JOptionPane.showMessageDialog(null, "Categoria : " + exercicio21(ex21.getIdade()), "Categorias Idade", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
							
                        case 22:
                        	Exercicio22 ex22 = new Exercicio22();
                        	ex22.setCodigoProduto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do Produto:  ")));
                        	JOptionPane.showMessageDialog(null, exercicio22(ex22.getCodigoProduto()), "Tipo Produto", JOptionPane.INFORMATION_MESSAGE);
                        	sair= true;
                        	break;
						default:
							JOptionPane.showMessageDialog(null,"VocÃª tem que digitar um valor entre 1 e 25");
							sair = true;
							break;
						case 23:
							Exercicio23 ex23 = new Exercicio23();
							ex23.setDistanciaSinal(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a distancia para o sinal: ")));
							ex23.setStatusSinal(JOptionPane.showInputDialog(null, "Qual é o status do Sinal no momento: "));
							JOptionPane.showMessageDialog(null, exercicio23(ex23.getDistanciaSinal() , ex23.getStatusSinal()), "Sinal de Transito", JOptionPane.INFORMATION_MESSAGE);
							sair = true;
							break;
						case 24:
							Exercicio24 ex24 = new Exercicio24();
							ex24.setHoraEntrada(Double.parseDouble(JOptionPane.showInputDialog("Hora Entrada")));
							ex24.setHoraSaida(Double.parseDouble(JOptionPane.showInputDialog("Hora Saida")));
							ex24.setMinutoEntrada(Double.parseDouble(JOptionPane.showInputDialog("Minutos Entrada")));
							ex24.setMinutoSaida(Double.parseDouble(JOptionPane.showInputDialog("Minutos Saida")));
							JOptionPane.showMessageDialog(null, "O valor a ser pao é: " + exercicio24(ex24.getHoraEntrada() , ex24.getHoraSaida() , ex24.getMinutoEntrada() , ex24.getMinutoSaida()) , "Estacionamento" , JOptionPane.INFORMATION_MESSAGE );
							sair = true;
							break;
						case 25:
							Exercicio25 ex25 = new Exercicio25();
							ex25.setHoraEntrada(Double.parseDouble(JOptionPane.showInputDialog("Hora Entrada")));
							ex25.setHoraSaida(Double.parseDouble(JOptionPane.showInputDialog("Hora Saida")));
							ex25.setMinutoEntrada(Double.parseDouble(JOptionPane.showInputDialog("Minutos Entrada")));
							ex25.setMinutoSaida(Double.parseDouble(JOptionPane.showInputDialog("Minutos Saida")));
							JOptionPane.showMessageDialog(null, "O valor a ser pao é: " + exercicio24(ex25.getHoraEntrada() , ex25.getHoraSaida() , ex25.getMinutoEntrada() , ex25.getMinutoSaida()) , "Estacionamento" , JOptionPane.INFORMATION_MESSAGE );
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
        private static String exercicio18(int anoNascimento) {
        	if ((2018 - anoNascimento) >= 16 && (2018 - anoNascimento) < 18)
        		return "Ja pode Votar";
        	else if ( (2018 - anoNascimento) >= 18  )
        		return "Ja pode tirar CNH";
        	return " pode Crescer primeiro";
        }
        
        private static String exercicio20(Double a , Double b , Double c) {
        	        	
        	if ( a.equals(b) && a.equals(c))
        		return "Equilatero";
        	else if ( a.equals(b) || a.equals(c) || b.equals(c) )
        		return "Isóceles";
        	return "Escaleno";
        }
        private static String exercicio21(int idade) {
        	if ( idade >= 5 && idade <= 7)
        		return "Infantil A";
        	else if (idade >= 8 && idade <= 10)
        		return "Infantil B";
        	else if (idade >= 11 && idade <= 13)
        		return "Juvenil A";
        	else if ( idade >= 14 && idade <= 17)
        		return "Juvenil B";
        	else if ( idade >= 18)
        		return "Adulto";
        	return "Invalida";
        	
        }
        private static String exercicio22(int codigoProduto) {
        	if ( codigoProduto == 1)
        		return "Alimento não perecível";
        	else if (codigoProduto == 2 || codigoProduto == 3 || codigoProduto == 4)
        		return "Alimento perecível";
        	else if (codigoProduto == 5 || codigoProduto == 6)
        		return "Vestuário";
        	else if (codigoProduto == 7)
        		return "higiene Pessoal";
        	else if (codigoProduto == 8 || codigoProduto == 9)
        		return "Limpeza e Utensílios Domesticos";
        	return "Invalido";
        	
        }
        private static String exercicio23(Double distanciaSinal , String statusSinal) {
        	if ( statusSinal.equals("V"))
        		return "Pare";
        	else if ( statusSinal.equals("A") && distanciaSinal < 5.0 )
        		return " Passe com Cuidado";
        	else if (statusSinal.equals("A") && distanciaSinal >= 5.0 )
        		return "Pare";
        	return "Passar";
        }
        private static Double exercicio24(Double horaEntrada , Double horaSaida, Double minutoEntrada , Double minutoSaida) {
        	Double valorAPagar = 0.0;
        	valorAPagar =  (((horaSaida * 60) + minutoSaida) - ((horaEntrada * 60 ) + minutoEntrada ));
        	if (valorAPagar % 60 == 0.0)
        		return (valorAPagar/60)*4;
        	else 
        		return (Math.floor(valorAPagar/60))*4.0 + 4.0;
        
        }
        private static Double exercicio25(Double horaEntrada , Double horaSaida, Double minutoEntrada , Double minutoSaida) {
        	Double valorAPagar = 0.0;
        	valorAPagar =  (((horaSaida * 60) + minutoSaida) - ((horaEntrada * 60 ) + minutoEntrada ));
        	if (valorAPagar % 60 == 0.0)
        		return (valorAPagar/60)*4;
        	else 
        		return (Math.floor(valorAPagar/60))*4.0 + 4.0;
        
        }
        
        

}

	



	


