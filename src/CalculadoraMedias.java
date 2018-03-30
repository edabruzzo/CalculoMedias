import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraMedias {
	
	
	public static void main (String[] args) {
		
		//preciso saber previamente do usuário quantos dados comporão a amostra
		System.out.println("QUANTOS DADOS CONTÉM A AMOSTRA ?");
		Scanner quantidadeDados = new Scanner(System.in);
		int qtdeDadosInseridosPeloUsuario = quantidadeDados.nextInt();
		
		//preenchendo um array com os valores entrados pelo usuário, já dimensionado
		//de acordo com a quantidade de elementos informados, inclusive considerando 
		//os repetidos
		int[] classes = new int[qtdeDadosInseridosPeloUsuario];
		
		System.out.println("Preenchendo a amostra.");
		
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
			
			
			
		//CONTAR A FREQUENCIA DE CADA NÚMERO: http://www.guj.com.br/t/contar-numeros-repetidos-arraylist/58125/11
			
			ArrayList<Integer> dadosAmostra = new ArrayList<Integer>();
			
			for (int i=0; i < classes.length; i++) {
				//transferindo efetivamente os valores do array para a lista
				dadosAmostra.add(classes[i]);
			}
			
			/*
			Set<Integer> numerosSemRepeticoes = new HashSet<Integer>(dadosAmostra);
			Iterator<Integer> iteradorDeNumerosSemRepeticoes = numerosSemRepeticoes.iterator();
			while (iteradorDeNumerosSemRepeticoes.hasNext()) {
				
				System.out.println("FREQUÊNCIA DOS NÚMEROS : " + Collections.frequency(dadosAmostra,
						iteradorDeNumerosSemRepeticoes.next()));
				
			} // while
			*/
			
			
			//MONTANDO A TABELA DE FREQUENCIA 
			
			/*
			 * 
			 * ORIGEM DA SOLUÇÃO :
			 * 
			 *  http://www.guj.com.br/t/contar-numeros-repetidos-arraylist/58125/11
			 * 
			 */
			
			Map<Integer, Integer> tabelaFrequencia = new HashMap<Integer, Integer>();   
			for(int valor : dadosAmostra) {
			
				if (!tabelaFrequencia.containsKey(valor)) {   
					tabelaFrequencia.put(valor, 0);   
				   }   
				tabelaFrequencia.put(valor, tabelaFrequencia.get(valor)+1);   
				}     

		/*
			
			Set<Map.Entry<Integer, Integer>> valores = new TreeSet<Map.Entry<Integer, Integer>>(
					new Comparator<Map.Entry<Integer, Integer>>() {   
					      public int compare(Map.Entry<Integer, Integer> o2, Map.Entry<Integer, Integer> o1) {   
					          return o1.getValue().compareTo(o2.getValue());   
					      }   
					   });   
			
			valores.addAll(tabelaFrequencia.entrySet());
			
			System.out.print("TABELA FREQUENCIA : " + tabelaFrequencia.entrySet().);
			
			
			for (Map.Entry<Integer, Integer> valor : valores) {   
			System.out.printf("Número: %d   Vezes: %d", valor.getKey(), valor.getValue()); 
			}
			
			*/
			
			int somaValoresAmostrados = 0;
			int somaFrequencias = 0;
			
			for (Integer key : tabelaFrequencia.keySet()) {
				
				System.out.println("VALOR : " + key + "FREQUÊNCIA :"+tabelaFrequencia.get(key)+".");
				
				somaValoresAmostrados += key;
				somaFrequencias += tabelaFrequencia.get(key);
			
			}

			
			calculaMediaAritmetica(somaValoresAmostrados, somaFrequencias);
			calculaMediaHarmonica (tabelaFrequencia, somaFrequencias);
			calculaMediaGeometrica(tabelaFrequencia, somaFrequencias);
						
		} // main
			

	
	
	
	public static void calculaMediaAritmetica(int somaValoresDados_Xi, int somaFrequenciaDados_Fi) {
		
		double mediaAritmetica = 0;
	
		mediaAritmetica = (somaValoresDados_Xi * somaFrequenciaDados_Fi) / somaFrequenciaDados_Fi; 
		
		System.out.println("A MÉDIA ARITMÉTICA DOS DADOS AMOSTRADOS É : " + mediaAritmetica);
		
	}
	
	
	public static void calculaMediaHarmonica (Map<Integer, Integer> tabelaFrequencia, int somatoriaFrequencias_Fi) {
		
		double mediaHarmonica = 0;
		double valorFiDivideXi = 0;

			for (Integer key : tabelaFrequencia.keySet()) {
				
				int valorXi = key;
				int valorFi = tabelaFrequencia.get(key);
				
				valorFiDivideXi += (valorFi / valorXi);
				
			}
       
		mediaHarmonica = somatoriaFrequencias_Fi / valorFiDivideXi;		
			

		System.out.println("A MÉDIA HARMÔNICA DOS DADOS AMOSTRADOS É : " + mediaHarmonica);
		
		
	}
	
	
	public static void calculaMediaGeometrica(Map<Integer, Integer> tabelaFrequencia, int somatorioFrequencia) {
		
		double mediaGeometrica = 0;
		double somatoriaValorFiMultiplicaLogXi = 0;
	    double logMediaGeometrica = 0;
	    double antilogMediaGeometrica = 0;
		
			for (Integer key : tabelaFrequencia.keySet()) {
				
				int valorFi = tabelaFrequencia.get(key);
				
				somatoriaValorFiMultiplicaLogXi += (valorFi * Math.log10(key));

			}
        
			logMediaGeometrica = somatoriaValorFiMultiplicaLogXi / somatorioFrequencia;
		    //A MÉDIA GEOMÉTRICA É JUSTAMENTE O ANTILOG
			antilogMediaGeometrica = Math.pow(10, logMediaGeometrica);		
			

		System.out.println("A MÉDIA GEOMÉTRICA DOS DADOS AMOSTRADOS É : " + mediaGeometrica);
				
		
		}
	
		
		
}
	


