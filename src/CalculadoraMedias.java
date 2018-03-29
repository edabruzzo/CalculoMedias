import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraMedias {
	
	
	public static void main (String[] args) {
		
		System.out.println("QUANTOS DADOS CONTÉM A AMOSTRA ?");
		Scanner quantidadeDados = new Scanner(System.in);
		int qtdeDadosInseridosPeloUsuario = quantidadeDados.nextInt();
		
		int[] classes = new int[qtdeDadosInseridosPeloUsuario];
		
		int x1 = classes.length;
		
		
		
		
		System.out.println("Preenchendo a amostra com valores aleatórios.");
		
		//LAÇO PARA PREENCHER A AMOSTRA
		for (int i=0; i < classes.length; i++ ) {
		
			/*
			
			POSSO PREENCHER COM VALORES ALEATÓRIOS ATRAVÉS DE RANDOM
			
			Random valorAleatorio = new Random();
			classes[i] = valorAleatorio.nextInt(50); 					
			
			 */
			
			//OU RECEBER OS VALORES COMO ENTRADA DO USUÁRIO
			//LAÇO PARA PREENCHER A AMOSTRA
			System.out.println("DIGITE O "+(i+1)+"º VALOR DA AMOSTRA :");
			Scanner recebeValoresUsuario = new Scanner(System.in);
			classes[i] = recebeValoresUsuario.nextInt();
		
        }  
			
		
		
		
		//PARA INPRIMIR A AMOSTRA 
				for (int i = 0; i < classes.length; i ++ ) {
					
					System.out.println("VALOR DA AMOSTRA - ELEMENTO NÚMERO " + (i+1) + ": " + 
					classes[i]);
					
				}
			

			//ORDENAR OS VALORES DA AMOSTRA
			for(int i = 0; i < classes.length; i++ ) {
				 
				for (int j = 0; j < classes.length -1; j++) {

					System.out.println("ESTOU NO SEGUNDO LAÇO COMPARANDO O " +(j+1) + "º ELEMENTO "
							+ "DA AMOSTRA DE VALOR = " + classes[j] + " COM O "+ (j+2)+"º ELEMENTO DA AMOSTRA DE VALOR = "
							+ classes[j+1]);
					
					if (classes[j] > classes[j+1]) {
						
						System.out.println("FOI VERIFICADO QUE O "+(j+1) + "º ELEMENTO DO SEGUNDO LAÇO DE VALOR = " 
						+ classes[j] + " É MAIOR QUE O " +  (j+2) + "º ELEMENTO DA AMOSTRA DE VALOR = "  
								+ classes[j+1]);
				
						
						int x = 0;
						x = classes[j+1];
						classes[j+1] = classes[j];
						classes[j] = x;
					
				}	
				
					
				}
					
		
			}
			
			
		
		int[] frequencia = new int[10];
		int[] valor = new int[10];
		int count = 0;
			
		
		//PARA VERIFICAR A FREQUÊNCIA DOS NÚMEROS	
		
		for (int i = 0; i < classes.length; i++) {
			count = 0;
			frequencia[i]=0;
			for(int j = i+1; j < classes.length; j++) {
			
				System.out.println("VERIFICANDO A FREQUÊNCIA DOS NÚMEROS. "
						+ "VERIFICANDO SE O "+ (j+1)+ "º ELEMENTO, DE VALOR = "+classes[j] + ",  É IGUAL AO "+(i+1)+""
								+ "º ELEMENTO DE VALOR = "+ classes[i]);
					
				if (classes[j] == classes[i]) {
					
					 count++;
					 valor[i]=classes[i];
					 frequencia[i] = count;
					
					 System.out.println(" VALOR REPETIDO: VALOR["+(i+1)+"] = " + valor[i] + " "
					 		+ "FREQUENCIA["+(i+1)+"] = " + frequencia[i]);
				}
					
				
										
				}
				
				
			}
			
			
		//PARA INPRIMIR A AMOSTRA E A FREQUÊNCIA
		System.out.println("IMPRIMINDO A AMOSTRA JÁ ORDENADA E AS FREQUENCIAS :");
		
		for (int i = 0; i < classes.length; i ++ ) {
			
			System.out.println("VALOR DA AMOSTRA - ELEMENTO NÚMERO " + (i+1) + " DE VALOR =  " + 
			valor[i] + "FREQUENCIA COM O QUE O NÚMERO APARECE :" + frequencia[i]);
		}
					
		
		/*
		
		
		public double calculaMediaAritmetica() {
			
			
			
			
		}
		
		
		public double calculaMediaHarmonica() {
			
			
		}
		
		
		public double calculaMediaGeometrica() {
			
			
		}
		
		*/
		
	}
	

}
