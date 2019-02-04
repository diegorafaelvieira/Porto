package porto;

public class Container {

	//atributos
	private String codigo;
	private String descricao;
	private String localizacao;
	private String origem;
	private String destino;
	private String dataEntrada;   //DATE
	private String dataSaida;    //DATE
	
	
	//construtor
	public Container(String codigo, String descricao, String localizacao, String origem, String destino,
			String dataEntrada, String dataSaida) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.localizacao = localizacao;
		this.origem = origem;
		this.destino = destino;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	//GET e SET
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public String getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	
}