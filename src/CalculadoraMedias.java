import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraMedias {
	
	
	public static void main (String[] args) {
		
		System.out.println("QUANTOS DADOS CONT�M A AMOSTRA ?");
		Scanner quantidadeDados = new Scanner(System.in);
		int qtdeDadosInseridosPeloUsuario = quantidadeDados.nextInt();
		
		int[] classes = new int[qtdeDadosInseridosPeloUsuario];
		
		int x1 = classes.length;
		
		
		
		
		System.out.println("Preenchendo a amostra com valores aleat�rios.");
		
		//LA�O PARA PREENCHER A AMOSTRA
		for (int i=0; i < classes.length; i++ ) {
		
			/*
			
			POSSO PREENCHER COM VALORES ALEAT�RIOS ATRAV�S DE RANDOM
			
			Random valorAleatorio = new Random();
			classes[i] = valorAleatorio.nextInt(50); 					
			
			 */
			
			//OU RECEBER OS VALORES COMO ENTRADA DO USU�RIO
			//LA�O PARA PREENCHER A AMOSTRA
			System.out.println("DIGITE O "+(i+1)+"� VALOR DA AMOSTRA :");
			Scanner recebeValoresUsuario = new Scanner(System.in);
			classes[i] = recebeValoresUsuario.nextInt();
		
        }  
			
		
		
		
		//PARA INPRIMIR A AMOSTRA 
				for (int i = 0; i < classes.length; i ++ ) {
					
					System.out.println("VALOR DA AMOSTRA - ELEMENTO N�MERO " + (i+1) + ": " + 
					classes[i]);
					
				}
			

			//ORDENAR OS VALORES DA AMOSTRA
			for(int i = 0; i < classes.length; i++ ) {
				 
				for (int j = 0; j < classes.length -1; j++) {

					System.out.println("ESTOU NO SEGUNDO LA�O COMPARANDO O " +(j+1) + "� ELEMENTO "
							+ "DA AMOSTRA DE VALOR = " + classes[j] + " COM O "+ (j+2)+"� ELEMENTO DA AMOSTRA DE VALOR = "
							+ classes[j+1]);
					
					if (classes[j] > classes[j+1]) {
						
						System.out.println("FOI VERIFICADO QUE O "+(j+1) + "� ELEMENTO DO SEGUNDO LA�O DE VALOR = " 
						+ classes[j] + " � MAIOR QUE O " +  (j+2) + "� ELEMENTO DA AMOSTRA DE VALOR = "  
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
			
		
		//PARA VERIFICAR A FREQU�NCIA DOS N�MEROS	
		
		for (int i = 0; i < classes.length; i++) {
			count = 0;
			frequencia[i]=0;
			for(int j = i+1; j < classes.length; j++) {
			
				System.out.println("VERIFICANDO A FREQU�NCIA DOS N�MEROS. "
						+ "VERIFICANDO SE O "+ (j+1)+ "� ELEMENTO, DE VALOR = "+classes[j] + ",  � IGUAL AO "+(i+1)+""
								+ "� ELEMENTO DE VALOR = "+ classes[i]);
					
				if (classes[j] == classes[i]) {
					
					 count++;
					 valor[i]=classes[i];
					 frequencia[i] = count;
					
					 System.out.println(" VALOR REPETIDO: VALOR["+(i+1)+"] = " + valor[i] + " "
					 		+ "FREQUENCIA["+(i+1)+"] = " + frequencia[i]);
				}
					
				
										
				}
				
				
			}
			
			
		//PARA INPRIMIR A AMOSTRA E A FREQU�NCIA
		System.out.println("IMPRIMINDO A AMOSTRA J� ORDENADA E AS FREQUENCIAS :");
		
		for (int i = 0; i < classes.length; i ++ ) {
			
			System.out.println("VALOR DA AMOSTRA - ELEMENTO N�MERO " + (i+1) + " DE VALOR =  " + 
			valor[i] + "FREQUENCIA COM O QUE O N�MERO APARECE :" + frequencia[i]);
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
