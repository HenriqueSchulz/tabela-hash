package entidades;

public abstract class TabelaHash {
	
	private int tamanho;
	private int colisoes = 0;
	
	//Tabela de nós hash
	private NoHash[] tabela;
	
	//Criando tabela hash com tamanho variado
	public TabelaHash(int tamanho) {
		//Criando um vetor de nós
		tabela = new NoHash[tamanho];
		this.tamanho = tamanho;
	}
	
	//Função implementada em cada classe
	public abstract int hash(int codigo);
	
	public void insercao(Registro registro) {
		
		//Calculando o hash
		int hash = hash(registro.getCodigo());
		
		//Se nao houver colisão
		if(tabela[hash] == null) {
			
			//Inserindo na posição calculado
			tabela[hash] = new NoHash(registro, null);
			return;
		}
		
		//Se houver colisão
		this.colisoes++;
		
		//Percorrendo a lista de nós
		NoHash noAtual = tabela[hash];
		
		while(noAtual.getProx() != null) {
			noAtual = noAtual.getProx();
		}
		
		noAtual.setProx(new NoHash(registro, null));
		
	}
	
	public Registro busca(int codRegistro) {
		
		int hash = hash(codRegistro);
		
		NoHash atual = tabela[hash];
		
		//Se o primeiro for nulo não existe elemento com esse código;
		if(atual == null) {
			//System.out.println("Elemento nao encontrado");
			return null;
		}
		
		while(atual.getRegistro().getCodigo() != codRegistro) {
			atual = atual.getProx();
			//Se o ultimo for nulo não existe elemento com esse código;
			if(atual == null) {
				//System.out.println("Elemento nao encontrado");
				return null;
			}
		}
		
		return atual.getRegistro();
	}

	public int getColisoes() {
		return colisoes;
	}	
	
	public int getTamanho() {
		return tamanho;
	}
}
