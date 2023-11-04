package entidades;

public class TabelaHashDobramento extends TabelaHash{

	public TabelaHashDobramento(int tamanho) {
		super(tamanho);
	}

	@Override
	public int hash(int codigo) {
		
		int p1 = codigo / 1000000;
		int p2 = (codigo / 1000) % 1000;
		int p3 = codigo % 1000;
				
		return ((p1 + p2 + p3) % this.getTamanho())%this.getTamanho();
	}

}
