package entidades;

public class Registro {
	
	private int codigo;
	
	public Registro() {}

	public Registro(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	};
	
	public String toString() {
		return "Cód Produto: " + codigo;
	}
	
}
