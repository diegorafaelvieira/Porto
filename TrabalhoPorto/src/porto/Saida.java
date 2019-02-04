package porto;

public class Saida {

	//atributos
	private String destino;
	private String codigo;
	private String dataSaida;
	
	//construtor
	public Saida(String destino, String codigo, String dataSaida) {
		super();
		this.destino = destino;
		this.codigo = codigo;
		this.dataSaida = dataSaida;
	}

	//GET e SET
	public String getDestino() {
		return destino;
	}

	

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	
}
