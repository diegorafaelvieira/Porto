package porto;

public class Caminhao {

	//atributos
	private String placa;
	private String transportadora;
	private String motorista;
	
	//contrutor
	public Caminhao(String placa, String transportadora, String motorista) {
		super();
		this.placa = placa;
		this.transportadora = transportadora;
		this.motorista = motorista;
	}

	//GET e SET
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	
	
	
}
