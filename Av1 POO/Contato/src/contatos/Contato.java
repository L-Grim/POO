package contatos;

public class Contato {
	
	// Atributos De Contato
	private String nome;
	private long telefone;
	private String email;
	private Endereco endereco;
	
	// Getters e Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public long getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
}
