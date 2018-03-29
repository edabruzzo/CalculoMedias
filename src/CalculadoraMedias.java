import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CalculadoraMedias {
	
	
	public static void main (String[] args) {
		
		//preciso saber previamente do usu�rio quantos dados compor�o a amostra
		System.out.println("QUANTOS DADOS CONT�M A AMOSTRA ?");
		Scanner quantidadeDados = new Scanner(System.in);
		int qtdeDadosInseridosPeloUsuario = quantidadeDados.nextInt();
		
		//preenchendo um array com os valores entrados pelo usu�rio, j� dimensionado
		//de acordo com a quantidade de elementos informados, inclusive considerando 
		//os repetidos
		int[] classes = new int[qtdeDadosInseridosPeloUsuario];
		
		System.out.println("Preenchendo a amostra.");
		
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
			
			
			
			//CONTAR A FREQUENCIA DE CADA N�MERO: http://www.guj.com.br/t/contar-numeros-repetidos-arraylist/58125/11
			
			ArrayList<Integer> dadosAmostra = new ArrayList<Integer>();
			
			for (int i=0; i < classes.length; i++) {
				//transferindo efetivamente os valores do array para a lista
				dadosAmostra.add(classes[i]);
			}
			
			/*
			Set<Integer> numerosSemRepeticoes = new HashSet<Integer>(dadosAmostra);
			Iterator<Integer> iteradorDeNumerosSemRepeticoes = numerosSemRepeticoes.iterator();
			while (iteradorDeNumerosSemRepeticoes.hasNext()) {
				
				System.out.println("FREQU�NCIA DOS N�MEROS : " + Collections.frequency(dadosAmostra,
						iteradorDeNumerosSemRepeticoes.next()));
				
			} // while
			*/
			
			
			//MONTANDO A TABELA DE FREQUENCIA
			Map<Integer, Integer> tabelaFrequencia = new HashMap<Integer, Integer>();   
			for(int valor : dadosAmostra) {
			
				if (!tabelaFrequencia.containsKey(valor)) {   
					tabelaFrequencia.put(valor, 0);   
				   }   
				tabelaFrequencia.put(valor, tabelaFrequencia.get(valor)+1);   
				}     
				
			Set<Map.Entry<Integer, Integer>> valores = new TreeSet<Map.Entry<Integer, Integer>>(
					new Comparator<Map.Entry<Integer, Integer>>() {   
					      public int compare(Map.Entry<Integer, Integer> o2, Map.Entry<Integer, Integer> o1) {   
					          return o1.getValue().compareTo(o2.getValue());   
					      }   
					   });   
			
			valores.addAll(tabelaFrequencia.entrySet());
			
			System.out.print("TABELA FREQUENCIA : ");
			
			for (Map.Entry<Integer, Integer> valor : valores) {   
			System.out.printf("N�mero: %d   Vezes: %d", valor.getKey(), valor.getValue()); 
			}
			
			
		} // main
			
	
		
		/*
		
		
		public double calculaMediaAritmetica() {
			
			
			
			
		}
		
		
		public double calculaMediaHarmonica() {
			
			
		}
		
		
		public double calculaMediaGeometrica() {
			
			
		}
		
		*/
		
	}
	


