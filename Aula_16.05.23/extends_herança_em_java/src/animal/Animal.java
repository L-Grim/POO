package animal;

public class Animal {

	// Atributo
	private String nome;

	// Construtores
	public Animal(String nome) {
		this.nome = nome;
	}

	public Animal() {
	}

	// Getter e Setter (nome)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodos
	public void comer() {
		System.out.println(nome + " está comendo");
	}
	
	public void dormir() {
		System.out.println(nome + " está dormindo");
	}
	
	public void andar() {
		System.out.println(nome + " está andando");
	}
	
	public void miar() {
		System.out.println(nome + " - Miau");
	}
	
}
