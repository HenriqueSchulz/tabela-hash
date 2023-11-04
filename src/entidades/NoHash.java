package entidades;

public class NoHash {
	
	private Registro registro;
	private NoHash prox;
	
	public NoHash(){}
	
	public NoHash(Registro registro, NoHash prox) {
		this.registro = registro;
		this.prox = prox;
	}

	public Registro getRegistro() {
		return registro;
	}

	public NoHash getProx() {
		return prox;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public void setProx(NoHash prox) {
		this.prox = prox;
	}
}
