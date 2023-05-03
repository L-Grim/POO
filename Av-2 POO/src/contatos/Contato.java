package contatos;

public class Contato {
	
	private String nome;
	private long telefone;
	private String email;
	Endereco endereco;
	
	//Construtor
	public Contato(String nome, long telefone, String email, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	// Getter e Setter (nome)
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	// Getter e Setter (telefone)
	public void setTelefone(long tel) {
		this.telefone = tel;
	}
	public long getTelefone() {
		return telefone;
	}
	
	// Getter e Setter (email)
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + "]";
	}
	
}