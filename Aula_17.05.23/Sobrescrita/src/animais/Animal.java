package animais;

public class Animal {

	// Atriboto
	String nome;

	// Construtor
	public Animal(String nome) {
		this.setNome(nome);
	}

	public Animal() {
	}

	// Getter e Setter de nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodos
	void comer() {
		System.out.println(nome + " está comendo...");
	}

	void dormir() {
		System.out.println(nome + " está dormindo...");
	}

}
