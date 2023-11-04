package programa;

import java.util.Random;

import entidades.Registro;
import entidades.TabelaHash;
import entidades.TabelaHashDobramento;
import entidades.TabelaHashMultiplicacao;
import entidades.TabelaHashDivisao;

public class Main {
	
		public static void main(String[] args) {
			
			//gerarRelatorios(10, 20000);
			//gerarRelatorios(100, 20000);
			//gerarRelatorios(1000, 20000);
			//gerarRelatorios(10000, 20000);
			//gerarRelatorios(100000, 20000);
			
			//gerarRelatorios(10, 100000);
			//gerarRelatorios(100, 100000);
			//gerarRelatorios(1000, 100000);
			//gerarRelatorios(10000, 100000);
			//gerarRelatorios(100000, 100000);
			
			gerarRelatorios(10, 500000);
			gerarRelatorios(100, 500000);
			gerarRelatorios(1000, 500000);
			gerarRelatorios(10000, 500000);
			gerarRelatorios(100000, 500000);
			
			//gerarRelatorios(10, 100000);
			//gerarRelatorios(100, 100000);
			//gerarRelatorios(1000, 100000);
			//gerarRelatorios(10000, 100000);
			//gerarRelatorios(100000, 100000);
			

			
		}
		
		public static Registro[] gerarRegistros(int quantidade, int[] consultas) {
			
			Registro[] registro = new Registro[quantidade];
			
			Random random = new Random();
			
	        int limiteInferior = 100000000;
	        int limiteSuperior = 999999999;
			
			for(int i = 0; i < quantidade; i++) {
				
				int codRegistro = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
				registro[i] = new Registro(codRegistro);
				
			}
			
			for(int i = 0; i < 5; i++) {
				
				int codRegistro = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
				consultas[i] = codRegistro;
				
			}
			
			return registro;
		}
		
		public static void inserirRegistros(TabelaHash tabelaHash, Registro[] registros, int quantidade) {
			
			for(int i = 0; i < quantidade; i++) {
				tabelaHash.insercao(registros[i]);
			}
			
		}
		
		public static void consultarRegistros(TabelaHash tabelaHash, int[] codRegistros, int quantidade) {
			
			for(int i = 0; i < quantidade; i++) {
			
				Registro resultado = tabelaHash.busca(codRegistros[i]); 
				if(resultado != null) {
					resultado.getCodigo();
				}
			}
		}
		
		public static void gerarRelatorios(int tamanhoTabela, int tamanhoRegistros) {
			
			long tempoInicioInsercao;
			long tempoFimInsercao;
			long tempoTotalInsercao;
			
			long tempoInicioBusca;
			long tempoFimBusca;
			long tempoTotalBusca;
			
			int[] consultas = new int[5];
			Registro[] registros = gerarRegistros(tamanhoRegistros, consultas);
			
			TabelaHash tabelaHashDivisao = new TabelaHashDivisao(tamanhoTabela);
			TabelaHash tabelaHashDobrameto = new TabelaHashDobramento(tamanhoTabela);
			TabelaHash tabelaHashMultiplicacao = new TabelaHashMultiplicacao(tamanhoTabela);
			
			tempoInicioInsercao = System.currentTimeMillis();
			inserirRegistros(tabelaHashDivisao, registros, tamanhoRegistros);
			tempoFimInsercao = System.currentTimeMillis();
			tempoTotalInsercao = tempoFimInsercao - tempoInicioInsercao;
			
			tempoInicioBusca = System.currentTimeMillis();
			consultarRegistros(tabelaHashDivisao, consultas, 5);
			tempoFimBusca = System.currentTimeMillis();
			tempoTotalBusca = tempoFimBusca - tempoInicioBusca;
			
			System.out.println("==============================================================");
			System.out.println("Tabela de DIVISAO com tamanho " + tamanhoTabela);
			System.out.println("Tempo total de insercao " + tamanhoRegistros + " elementos: " + tempoTotalInsercao + " milissegundos");
			System.out.println("Tempo total de Busca 5 elementos: " + tempoTotalBusca + " milissegundos");
			System.out.println("Colisoes: " + tabelaHashDivisao.getColisoes());
			System.out.println("==============================================================");
			System.out.println();
			
			tempoInicioInsercao = System.currentTimeMillis();
			inserirRegistros(tabelaHashDobrameto, registros, tamanhoRegistros);
			tempoFimInsercao = System.currentTimeMillis();
			tempoTotalInsercao = tempoFimInsercao - tempoInicioInsercao;
			
			tempoInicioBusca = System.currentTimeMillis();
			consultarRegistros(tabelaHashDobrameto, consultas, 5);
			tempoFimBusca = System.currentTimeMillis();
			tempoTotalBusca = tempoFimBusca - tempoInicioBusca;
			
			System.out.println("==============================================================");
			System.out.println("Tabela de DOBRAMENTO com tamanho " + tamanhoTabela);
			System.out.println("Tempo total de insercao " + tamanhoRegistros + " elementos: " + tempoTotalInsercao + " milissegundos");
			System.out.println("Tempo total de Busca 5 elementos: " + tempoTotalBusca + " milissegundos");
			System.out.println("Colisoes: " + tabelaHashDobrameto.getColisoes());
			System.out.println("==============================================================");
			System.out.println();
			
			tempoInicioInsercao = System.currentTimeMillis();
			inserirRegistros(tabelaHashMultiplicacao , registros, tamanhoRegistros);
			tempoFimInsercao = System.currentTimeMillis();
			tempoTotalInsercao = tempoFimInsercao - tempoInicioInsercao;
			
			tempoInicioBusca = System.currentTimeMillis();
			consultarRegistros(tabelaHashMultiplicacao , consultas, 5);
			tempoFimBusca = System.currentTimeMillis();
			tempoTotalBusca = tempoFimBusca - tempoInicioBusca;
			
			System.out.println("==============================================================");
			System.out.println("Tabela de MULTIPLICACAO com tamanho " + tamanhoTabela);
			System.out.println("Tempo total de insercao " + tamanhoRegistros + " elementos: " + tempoTotalInsercao + " milissegundos");
			System.out.println("Tempo total de Busca 5 elementos: " + tempoTotalBusca + " milissegundos");
			System.out.println("Colisoes: " + tabelaHashDobrameto.getColisoes());
			System.out.println("==============================================================");
			System.out.println();
			
			
			
		}
}
