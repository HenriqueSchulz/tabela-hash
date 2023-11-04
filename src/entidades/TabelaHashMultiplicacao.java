package entidades;

public class TabelaHashMultiplicacao extends TabelaHash{
	
	public static final double fator = 0.618;
	
	public TabelaHashMultiplicacao(int tamanho) {
		super(tamanho);
	}

	@Override
	public int hash(int codigo) {
		
		double produto = codigo * 0.61803398875;
		double parteFracao = produto - (long) produto;
		long hash = (long) (this.getTamanho()* parteFracao);
		
		
		return (int)hash;
	}

}
