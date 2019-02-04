package porto;

public class Navio {

	//atributos
	private String matricula;
	private String transportadora;
	private String comandante;
	
	//construtor
	public Navio(String matricula, String transportadora, String comandante) {
		super();
		this.matricula = matricula;
		this.transportadora = transportadora;
		this.comandante = comandante;
	}

	//GET e SET
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getComandante() {
		return comandante;
	}

	public void setComandante(String comandante) {
		this.comandante = comandante;
	}
	
	
}
