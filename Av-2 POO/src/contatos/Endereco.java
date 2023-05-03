package contatos;

enum Estado {CA, SP, AM, DF, RJ, RN, MA, PR, BA, PE}

public class Endereco {
	
	private String rua;
	private int numero;
	private long cep;
	private String cidade;
	private Estado estado;
	
	//Construtor
	public Endereco(String rua, int numero, long cep, String cidade, Estado estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	// Getter e Setter (rua)
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return rua;
	}

	// Getter e Setter (numero)
	public void setNumero(int num) {
		this.numero = num;
	}
	public int getNumero() {
		return numero;
	}
	
	// Getter e Setter (cep)
	public void setCep(long cep) {
		this.cep = cep;
	}
	public long getCep() {
		return cep;
	}
	
	// Getter e Setter (cidade)
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
		
	// Getter e Setter (estado)
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Estado getEstado() {
		return estado;
	}

}
