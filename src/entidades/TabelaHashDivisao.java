package entidades;

public class TabelaHashDivisao extends TabelaHash {

	public TabelaHashDivisao(int tamanho) {
		super(tamanho);
	}

	@Override
	public int hash(int codigo) {
		return codigo % this.getTamanho();
	}
	
	
	
}
